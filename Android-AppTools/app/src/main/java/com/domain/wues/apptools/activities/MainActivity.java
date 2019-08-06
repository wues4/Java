package com.domain.wues.apptools.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.R;

public class MainActivity extends AppCompatActivity implements CommonColors {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setNaviBarColor();
    }

    public void click(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.aboutBtn:
                intent = new Intent(MainActivity.this, AboutActivity.class);
                break;

            case R.id.toolsBtn:
                intent = new Intent(MainActivity.this, ToolsActivity.class);
                break;
        }
        startActivity(intent);
    }

    @Override
    public void setNaviBarColor() {
        // NOTE: dzięki tej metodzie na systemach android powyżej 5.0 kolory naglowka i stopki beda takie jak kolory aplikacji,
        // po prostu aplikacja bedzie sie kolorystycznie zgrywac. Ponizej wersji 5.0 jest to niedostepne
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }
}
