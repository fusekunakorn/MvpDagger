package com.example.kunakornm.mvpdagger.model;


import dagger.Module;
import dagger.Provides;

@Module
    public class AppModule {
        @Provides
        public DataManager providesDataManager() {
            return new DataManager();
        }
    }

