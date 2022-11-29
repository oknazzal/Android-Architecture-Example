package com.oknazzal.architecture.example.feature.authentication.domain.usecase.validation

import android.text.TextUtils
import java.util.regex.Pattern
import javax.inject.Inject

class IsValidEmailUseCase @Inject constructor() {

    operator fun invoke(email: String?): Boolean {
        if (email == null) return false
        val emailPattern = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        return !TextUtils.isEmpty(email) && emailPattern.matcher(email).matches()
    }
}
