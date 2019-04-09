/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example.di.module;

import com.adit.example.MainContract;
import com.adit.example.model.Model;
import com.adit.example.presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {

    private MainContract.ViewCallBack viewCallBack;

    public MvpModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Provides
    public MainContract.ViewCallBack provideView() {
        return viewCallBack;
    }

    @Provides
    public MainContract.PresenterCallBack providePresenter(MainContract.ViewCallBack view, Model model) {
        return new MainPresenterImpl(view, model);
    }
}
