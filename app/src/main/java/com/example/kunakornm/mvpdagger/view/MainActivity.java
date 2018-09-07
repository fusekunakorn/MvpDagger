package com.example.kunakornm.mvpdagger.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kunakornm.mvpdagger.R;
import com.example.kunakornm.mvpdagger.presenter.MainPresenterImpl;
import com.example.kunakornm.mvpdagger.presenter.MainPresenterInterface;

public class MainActivity extends AppCompatActivity implements ViewInterface {
    private MainPresenterInterface mainPresenterInterface;
    MainPresenterImpl mainPresenter;
    TextView txt_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        init();
    }

    private void initPresenter() {
        mainPresenter = new MainPresenterImpl(this);
    }

    private void init() {
        txt_view = (TextView)findViewById(R.id.txt_view);
        mainPresenter.start();
        mainPresenter.loadMessage();
    }

    @Override
    public void showMessage(String msg) {
        txt_view.setText(msg);
    }

}
