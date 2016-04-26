package com.example.administrator.androidlib.application;

import android.app.Application;

import org.litepal.LitePalApplication;

/**
 * Created by pingp on 2016/4/26.
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePalApplication.initialize(this);
    }
}
