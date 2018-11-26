package com.example.kunakornm.mvpdagger.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.kunakornm.mvpdagger.R;
import com.example.kunakornm.mvpdagger.presenter.MainPresenterImpl;
import com.example.kunakornm.mvpdagger.presenter.MainPresenterInterface;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements ViewInterface {
    private MainPresenterInterface mainPresenterInterface;
    MainPresenterImpl mainPresenter;
    TextView txt_view;
    String TAG = "FUSE";
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
      //  TestRandomString();
    }
//    public void TestRandomString(){
//        Random rng = new Random();
//        Set<Integer> generated = new LinkedHashSet<Integer>();
//        Log.d(TAG, "generated: "+generated);
//        while (generated.size() < 10)
//        {
//            Integer next = rng.nextInt(10) + 1;
//            Log.d(TAG, "TestRandomString: "+next);
//            generated.add(next);
//            Log.d(TAG, "generated222: "+generated);
//        }
//    }

    @Override
    public void showMessage(String msg) {
        txt_view.setText(msg);
    }

}
