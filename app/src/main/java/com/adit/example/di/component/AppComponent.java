/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example.di.component;

import android.app.Application;
import android.content.Context;

import com.adit.example.InitApplication;
import com.adit.example.di.module.AppModule;
import com.adit.example.di.module.ContextModule;
import com.adit.example.di.module.DataModule;
import com.adit.example.model.Model;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, ContextModule.class})
public interface AppComponent {
    void inject(InitApplication initApplication);

    Context getContext();

    Model getFindItemsInteractor();

    Application getApplication();
}
