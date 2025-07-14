package com.minikano.f50_sms.utils

import android.content.Context
import android.os.Build
import android.util.Log
import android.widget.Toast

object DeviceModelChecker {
    private var isUnSupportDevice = false
    private val devicesBlackList = listOf(
        "MU5352"
    )
    private val frimwareWhiteList = listOf(
        "MU5352_DSV1.0.0B07",
        "MU5352_DSV1.0.0B05",
        "MU5352_DSV1.0.0B03",
        "MU300",
        "F50",
        "U30Air",
    )

    fun checkBlackList(): Boolean {
 
        return false
    }

    fun checkIsNotUFI(context: Context):Boolean{

        return false
    }
}
