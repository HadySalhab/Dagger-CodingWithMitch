package com.android.myapplication.dagger_codingwithmitch.di;

import android.app.Application;

import com.android.myapplication.dagger_codingwithmitch.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

//we should annotate all dagger components with @Component
@Component (modules = AndroidSupportInjectionModule.class)
public interface AppComponent extends AndroidInjector<BaseApplication> {
    @Component.Builder
    interface  Builder{

        //this will be attached to the chain of the builder pattern
        //when we want to create an instance of the Appcomponent
        //the name can be anything
        @BindsInstance
        Builder application (Application application);

        AppComponent build(); //this is mandatory
    }
}
