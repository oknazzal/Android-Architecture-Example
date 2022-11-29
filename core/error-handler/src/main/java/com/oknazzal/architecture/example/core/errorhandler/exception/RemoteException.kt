package com.oknazzal.architecture.example.core.errorhandler.exception

import com.oknazzal.architecture.example.core.errorhandler.model.HttpErrorBodyModel

sealed class RemoteException(message: String?, throwable: Throwable) : Throwable(message, throwable) {

    class Network(message: String?, throwable: Throwable) : RemoteException(message, throwable)

    class Http(
        message: String,
        throwable: Throwable,
        val body: HttpErrorBodyModel,
        val status: HttpStatus
    ) : RemoteException(message, throwable)

    class Unknown(message: String?, throwable: Throwable) : RemoteException(message, throwable)
}
