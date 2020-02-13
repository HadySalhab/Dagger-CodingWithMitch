package com.android.myapplication.dagger_codingwithmitch.di;

import com.android.myapplication.dagger_codingwithmitch.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    //we are telling dagger which classes are potential clients
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString(){
        return "this is a test String";
    }

}
