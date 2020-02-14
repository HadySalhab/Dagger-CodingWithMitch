package com.android.myapplication.dagger_codingwithmitch.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.android.myapplication.dagger_codingwithmitch.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    //gives us a request options
    static RequestOptions provideRequestOptions() {
        return RequestOptions
                .placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    @Singleton
    @Provides
    //Application is accessible from the AppComponent (@BindsInstance)
    //RequestOptions is available, because we declared its Provision
    //gives us glide instance
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions) {
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Singleton
    @Provides
    static Drawable provideAppDrawable(Application application) {
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }
}

