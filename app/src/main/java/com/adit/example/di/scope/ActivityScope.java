/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}