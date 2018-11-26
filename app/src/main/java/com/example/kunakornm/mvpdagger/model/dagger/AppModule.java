package com.example.kunakornm.mvpdagger.model.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    public DataManager provideDataManager(){
        return new DataManager();
    }
}
