@file:Suppress("UNCHECKED_CAST")

package com.oknazzal.architecture.example.core.errorhandler.result

class Result<out T> internal constructor(internal val value: Any?) {

    val isSuccess: Boolean get() = value !is Failure
    val isFailure: Boolean get() = value is Failure

    override fun toString(): String {
        return when (value) {
            is Failure -> value.toString()
            else -> "Success($value)"
        }
    }

    internal data class Failure(

        @JvmField
        var exception: Any
    )

    companion object {

        fun <T> success(value: T): Result<T> {
            return Result(value)
        }

        fun <T> failure(exception: Any): Result<T> {
            return Result(Failure(exception))
        }
    }
}

internal fun Result<*>.throwOnFailure() {
    if (value is Result.Failure) {
        throw value.exception as Throwable
    }
}

inline fun <R> runWithCatching(block: () -> R): Result<R> {
    return try {
        Result.success(block())
    } catch (e: Throwable) {
        Result.failure(e)
    }
}

fun <T> Result<T>.getOrThrow(): T {
    throwOnFailure()
    return value as T
}

fun <T> Result<T>.getOrNull(): T? {
    return when {
        isFailure -> null
        else -> value as T
    }
}

fun <R, T : R> Result<R>.getOrDefault(defaultValue: R): R {
    if (isFailure) {
        return defaultValue
    }
    return value as T
}

fun <R, T : R> Result<R>.getOrDefault(defaultValue: (Throwable) -> R): R {
    if (value is Result.Failure) {
        return defaultValue(value.exception as Throwable)
    }
    return value as T
}

fun <R, T> Result<T>.map(transform: (value: T) -> R): Result<R> {
    return when {
        isSuccess -> Result.success(transform(value as T))
        else -> Result(value)
    }
}

fun <T> Result<T>.mapError(transform: (value: Throwable) -> Throwable): Result<T> {
    return when (value) {
        is Result.Failure -> {
            value.exception = transform(value.exception as Throwable)
            Result(value)
        }
        else -> Result(value)
    }
}
