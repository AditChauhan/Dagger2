/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example;

import android.app.Application;
import android.content.Context;
import com.adit.example.di.component.AppComponent;
import com.adit.example.di.component.DaggerAppComponent;
import com.adit.example.di.module.AppModule;
import com.adit.example.di.module.ContextModule;
import com.adit.example.di.module.DataModule;


public class InitApplication extends Application {

    private AppComponent component;

    public static InitApplication get(Context context) {
        return (InitApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .contextModule(new ContextModule(this))
                .dataModule(new DataModule())
                .build();
    }

    public AppComponent component() {
        return component;
    }
}