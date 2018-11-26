package com.example.kunakornm.mvpdagger.component;


import com.example.kunakornm.mvpdagger.model.dagger.AppModule;
import com.example.kunakornm.mvpdagger.view.dagger.ViewDaggerActivity;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(ViewDaggerActivity viewDaggerActivity);
}
