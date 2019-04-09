/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example.di.component;

import com.adit.example.MainContract;
import com.adit.example.di.module.MvpModule;
import com.adit.example.di.scope.ActivityScope;
import com.adit.example.view.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = MvpModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    MainContract.PresenterCallBack getMainPresenter();
}
