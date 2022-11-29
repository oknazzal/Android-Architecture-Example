package com.oknazzal.architecture.example.core.errorhandler.handlers

import com.oknazzal.architecture.example.core.errorhandler.ErrorHandler
import com.oknazzal.architecture.example.core.errorhandler.exception.HttpStatus
import com.oknazzal.architecture.example.core.errorhandler.exception.RemoteException
import com.oknazzal.architecture.example.core.errorhandler.exception.RemoteException.Http
import com.oknazzal.architecture.example.core.errorhandler.exception.RemoteException.Network
import com.oknazzal.architecture.example.core.errorhandler.exception.RemoteException.Unknown
import com.oknazzal.architecture.example.core.errorhandler.model.HttpErrorBodyModel
import com.squareup.moshi.Moshi
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

internal class NetworkErrorHandler @Inject constructor(private val moshi: Moshi) : ErrorHandler {

    override fun getError(throwable: Throwable): RemoteException {
        return when (throwable) {
            is HttpException -> {
                val errorBody = throwable.response()?.errorBody()?.string()
                val error = if (errorBody != null) {
                    moshi.adapter(HttpErrorBodyModel::class.java).fromJson(errorBody)!!
                } else {
                    HttpErrorBodyModel()
                }
                Http(throwable.message(), throwable, error, HttpStatus.valueOf(throwable.code()))
            }
            is IOException -> Network(throwable.message, throwable)
            else -> Unknown(throwable.message, throwable)
        }
    }
}
