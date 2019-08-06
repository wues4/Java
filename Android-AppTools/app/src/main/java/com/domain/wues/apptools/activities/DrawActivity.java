package com.domain.wues.apptools.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.DrawView;
import com.domain.wues.apptools.R;

public class DrawActivity extends AppCompatActivity implements CommonColors {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DrawView drawView = new DrawView(this);
        setContentView(drawView);
        addContentView(drawView.cleanScreenBtn, drawView.params);
        setNaviBarColor();
    }

    @Override
    public void setNaviBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }
}
