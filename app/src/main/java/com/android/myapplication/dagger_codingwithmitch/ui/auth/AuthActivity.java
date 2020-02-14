package com.android.myapplication.dagger_codingwithmitch.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.android.myapplication.dagger_codingwithmitch.R;
import com.android.myapplication.dagger_codingwithmitch.viewmodels.ViewModelProviderFactory;
import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

//We should DaggerAppCompatActivity
public class AuthActivity extends DaggerAppCompatActivity {

    @Inject
    ViewModelProviderFactory mViewModelProviderFactory;

    private AuthViewModel viewModel;

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        viewModel = ViewModelProviders.of(this,mViewModelProviderFactory).get(AuthViewModel.class);
        setLogo();
    }

    private void setLogo(){
        requestManager.load(logo)
                .into((ImageView) findViewById(R.id.login_logo));
    }
}
