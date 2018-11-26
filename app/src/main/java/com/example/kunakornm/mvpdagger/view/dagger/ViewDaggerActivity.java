package com.example.kunakornm.mvpdagger.view.dagger;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.kunakornm.mvpdagger.App;
import com.example.kunakornm.mvpdagger.R;
import com.example.kunakornm.mvpdagger.presenter.dagger.DaggerPresenterImpl;

import javax.inject.Inject;

public class ViewDaggerActivity extends Activity implements ViewDaggerInterface {
    //DaggerPresenterImpl mainPresenter;
    TextView tvHello;
    @Inject
    DaggerPresenterImpl mainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvHello = (TextView) findViewById(R.id.txt_view);
        mainPresenter.attach(this);
     //   mainPresenter.loadMessage();
        ((App) getApplication()).getAppComponent().inject(this);

    }


    public void showGreetingMessage(String greetingMessage) {
        tvHello.setText(greetingMessage);

    }



}
