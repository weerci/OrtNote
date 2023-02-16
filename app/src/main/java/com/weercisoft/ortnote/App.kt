package com.weercisoft.ortnote

import android.app.Application

class App : Application() {

    lateinit var dependencyInjector: DependencyInjector

    override fun onCreate() {
        super.onCreate()

    }

    private fun initDependencyInjector(){
        dependencyInjector = DependencyInjector(this)
    }
}