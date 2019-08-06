package com.domain.wues.apptools.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.domain.wues.apptools.BackgroundOperation;
import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.R;

public class PrimeNumberActivity extends AppCompatActivity implements CommonColors {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNaviBarColor();
    }

    public void primeNumClick(View view) {
        new BackgroundOperation(this).execute();
    }

    @Override
    public void setNaviBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }
}
