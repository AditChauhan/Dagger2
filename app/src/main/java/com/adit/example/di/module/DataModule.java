/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example.di.module;

import com.adit.example.model.Model;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {

    @Provides
    public Model provideModelClass() {
        return new Model();
    }
}
