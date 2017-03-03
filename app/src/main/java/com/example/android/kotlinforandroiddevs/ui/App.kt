package com.example.android.kotlinforandroiddevs.ui

import android.app.Application
import com.example.android.kotlinforandroiddevs.ui.utils.DelegatesExt

class App: Application() {
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}