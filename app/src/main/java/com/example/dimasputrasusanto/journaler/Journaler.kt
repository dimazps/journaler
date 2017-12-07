package com.example.dimasputrasusanto.journaler

/**
 * Created by dimasputrasusanto on 7/12/17.
 */

import android.app.Application
import android.content.Context

class Journaler : Application() {

    companion object {
        var ctx: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
    }
}