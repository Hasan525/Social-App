package com.example.socialapp.android

import android.app.Application
import com.example.socialapp.android.di.appModule
import org.koin.core.context.GlobalContext.startKoin

class SocialApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule)
        }
    }
}