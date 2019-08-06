package com.domain.wues.apptools.activities;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.R;

public class CountdownActivity extends AppCompatActivity implements CommonColors {

    private EditText title, body, value;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNaviBarColor();
        title = findViewById(R.id.notifyTitleET);
        body = findViewById(R.id.notifyBodyET);
        value = findViewById(R.id.notifyValueET);
        start = findViewById(R.id.countdownStartBtn);
    }

    public void countdownClick(View view) {
        long startTime = Long.parseLong(value.getText().toString());
        final String startT = value.getText().toString();
        startTime = startTime*1000;
        new CountDownTimer(startTime, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                title.setEnabled(false);
                body.setEnabled(false);
                start.setEnabled(false);
                value.setEnabled(false);
                value.setText(""+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                createNotifi();
                title.setEnabled(true);
                body.setEnabled(true);
                start.setEnabled(true);
                value.setEnabled(true);
                value.setText(startT);
            }
        }.start();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void createNotifi()
    {
        Notification notifi = new Notification.Builder(this).
                setContentTitle(title.getText())
                .setContentText(body.getText())
                .setSmallIcon(R.drawable.ico)
                .build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, notifi);
    }

    @Override
    public void setNaviBarColor() {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
            getWindow().setNavigationBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
    }

}
