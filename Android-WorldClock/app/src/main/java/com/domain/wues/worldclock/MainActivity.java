package com.domain.wues.worldclock;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity implements CommonColors{

    Calendar current;
    Spinner spinner;
    TextView timezone, txtCurrentTime, txtTimeZoneTime;
    long miliSeconds;
    ArrayAdapter<String> idAdapter;
    SimpleDateFormat simpleDateFormat;
    Date resultDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNaviBarColor();

        spinner = findViewById(R.id.spinner);

        timezone = findViewById(R.id.timezone);
        txtCurrentTime = findViewById(R.id.txtCurrentTime);
        txtTimeZoneTime = findViewById(R.id.txtTimeZoneTime);

        String[] idArray = TimeZone.getAvailableIDs();

        simpleDateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");

        idAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, idArray);
        idAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(idAdapter);

        getGMTtime();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                getGMTtime();
                String selectedID = (String) (parent.getItemAtPosition(position));

                TimeZone timeZone = TimeZone.getTimeZone(selectedID);
                String TimeZoneName = timeZone.getDisplayName();

                int timeZoneOffset = timeZone.getRawOffset() / (60 * 1000);

                int hrs = timeZoneOffset / 60;
                int mins = timeZoneOffset % 60;
                miliSeconds = miliSeconds + timeZone.getRawOffset();

                resultDate = new Date(miliSeconds);
                System.out.println(simpleDateFormat.format(resultDate));

                timezone.setText(TimeZoneName + " : GMT " + hrs + "." + mins);
                txtTimeZoneTime.setText("" +simpleDateFormat.format(resultDate));
                miliSeconds = 0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void getGMTtime(){
        current = Calendar.getInstance();
        txtCurrentTime.setText("" + current.getTime());
        miliSeconds = current.getTimeInMillis();

        TimeZone tzCurrent = current.getTimeZone();
        int offset = tzCurrent.getRawOffset();
        if (tzCurrent.inDaylightTime(new Date())) {
            offset = offset + tzCurrent.getDSTSavings();
        }

        miliSeconds = miliSeconds - offset;

        resultDate = new Date(miliSeconds);
        System.out.println(simpleDateFormat.format(resultDate));
    }

    @Override
    public void setNaviBarColor() {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
            getWindow().setNavigationBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
    }
}
