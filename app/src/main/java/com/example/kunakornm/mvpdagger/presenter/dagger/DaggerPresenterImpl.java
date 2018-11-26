package com.example.kunakornm.mvpdagger.presenter.dagger;

import com.example.kunakornm.mvpdagger.model.dagger.DataManager;
import com.example.kunakornm.mvpdagger.view.dagger.ViewDaggerActivity;
import com.example.kunakornm.mvpdagger.view.dagger.ViewDaggerInterface;

import javax.inject.Inject;

public class DaggerPresenterImpl implements DaggerPresenterInterface {
    @Inject
    DataManager model;
    ViewDaggerInterface view;

    //todo inject Model into Presenter
    @Inject
    public DaggerPresenterImpl(DataManager dataManager) {
        this.model = dataManager;
    }

    @Override
    public void loadMessage() {
        String greetingMessage = model.getGreetingText();
        //  view.showGreetingMessage(greetingMessage);

    }

    /// todo link view with presenter
    @Override
    public void attach(ViewDaggerInterface viewDaggerInterface) {
       this.view = viewDaggerInterface;
    }




}
