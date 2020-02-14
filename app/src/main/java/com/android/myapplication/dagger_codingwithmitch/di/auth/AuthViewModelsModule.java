package com.android.myapplication.dagger_codingwithmitch.di.auth;

import androidx.lifecycle.ViewModel;

import com.android.myapplication.dagger_codingwithmitch.di.ViewModelKey;
import com.android.myapplication.dagger_codingwithmitch.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    //binds an impl to an interface (abstract or interface)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
