/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example.di.module;

import android.app.Application;

import com.adit.example.InitApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private InitApplication initApplication;

    public AppModule(InitApplication initApplication) {
        this.initApplication = initApplication;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return initApplication;
    }
}
