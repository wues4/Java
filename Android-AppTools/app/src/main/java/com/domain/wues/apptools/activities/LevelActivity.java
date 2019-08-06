package com.domain.wues.apptools.activities;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.R;

public class LevelActivity extends AppCompatActivity implements SensorEventListener, CommonColors {

    Context context = this;
    MediaPlayer mediaPlayer;
    TextView light, level;
    private SensorManager sensorManager;
    private Sensor lightSensor, levelSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNaviBarColor();
        mediaPlayer = MediaPlayer.create(context, R.raw.fresh);
        light = findViewById(R.id.lightTV);
        level = findViewById(R.id.levelTV);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        levelSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(this, levelSensor, SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor = sensorEvent.sensor;
        if (sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            level.setText(sensorEvent.values[0] + "\n"+ sensorEvent.values[1] + "\n" + sensorEvent.values[2]);
            if (sensorEvent.values[0]>0 && sensorEvent.values[0]<2) {
                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                }
            }
        }else if (sensor.getType() == Sensor.TYPE_LIGHT) {
            light.setText("" + sensorEvent.values[0]);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void setNaviBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }
}
