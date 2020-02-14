package com.android.myapplication.dagger_codingwithmitch.di;

import com.android.myapplication.dagger_codingwithmitch.di.auth.AuthViewModelsModule;
import com.android.myapplication.dagger_codingwithmitch.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    //we are telling dagger which classes are potential clients
    @ContributesAndroidInjector (
            //all subcomponents of the AuthActivity can use this viewModel
            modules = {AuthViewModelsModule.class}
    )
    abstract AuthActivity contributeAuthActivity();



}
