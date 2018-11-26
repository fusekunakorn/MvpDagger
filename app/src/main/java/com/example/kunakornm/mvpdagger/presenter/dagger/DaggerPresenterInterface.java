package com.example.kunakornm.mvpdagger.presenter.dagger;

import com.example.kunakornm.mvpdagger.view.dagger.ViewDaggerInterface;

public interface DaggerPresenterInterface {
    void loadMessage();
    void attach(ViewDaggerInterface viewDaggerInterface);
}
