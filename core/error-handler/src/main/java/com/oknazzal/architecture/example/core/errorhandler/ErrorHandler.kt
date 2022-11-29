package com.oknazzal.architecture.example.core.errorhandler

interface ErrorHandler {

    fun getError(throwable: Throwable): Throwable
}
