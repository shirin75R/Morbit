package com.trade.morbit.viewmodels

import android.app.Application
import io.adtrace.sdk.AdTrace
import io.adtrace.sdk.AdTraceConfig
import io.adtrace.sdk.BuildConfig

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val appToken = "5eor0gtxp3az"
        val environment: String =
            if (BuildConfig.DEBUG) AdTraceConfig.ENVIRONMENT_SANDBOX else AdTraceConfig.ENVIRONMENT_PRODUCTION
        val config = AdTraceConfig(this, appToken, environment)
        AdTrace.onCreate(config)
    }

}