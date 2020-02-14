package com.android.myapplication.dagger_codingwithmitch;

import android.app.Application;

import com.android.myapplication.dagger_codingwithmitch.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

//DaggerApplication from the Dagger-android dependency
public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
         return DaggerAppComponent.builder().application(this).build();
    }
}
