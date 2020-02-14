package com.android.myapplication.dagger_codingwithmitch.di;

import androidx.lifecycle.ViewModelProvider;

import com.android.myapplication.dagger_codingwithmitch.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
abstract class ViewModelFactoryModule {

    //providing an implementation to an interface.
    //like @Provides, just less code. Useful when we bind an impl to interface
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory (ViewModelProviderFactory modelProviderFactory);

}
