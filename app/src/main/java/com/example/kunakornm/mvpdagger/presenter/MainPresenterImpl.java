package com.example.kunakornm.mvpdagger.presenter;

import android.util.Log;

import com.example.kunakornm.mvpdagger.model.DataManager;
import com.example.kunakornm.mvpdagger.view.ViewInterface;

public class MainPresenterImpl implements MainPresenterInterface {

    DataManager model;
    ViewInterface viewInterface;

    public MainPresenterImpl(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    @Override
    public void start() {
        viewInterface.showMessage("Do something.");
    }

    @Override
    public void loadMessage() {
        //todo presenter get data from model
        model = new DataManager();
        String msg = model.getGreetingText();
        viewInterface.showMessage(msg);
    }

}
