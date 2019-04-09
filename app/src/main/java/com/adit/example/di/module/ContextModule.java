/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example.di.module;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }
}
