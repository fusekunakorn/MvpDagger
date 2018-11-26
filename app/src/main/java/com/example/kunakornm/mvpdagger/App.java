package com.example.kunakornm.mvpdagger;

import android.app.Application;

import com.example.kunakornm.mvpdagger.component.AppComponent;
import com.example.kunakornm.mvpdagger.component.DaggerAppComponent;

public class App extends Application {

    private AppComponent appComponent ;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
