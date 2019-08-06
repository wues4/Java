package com.domain.wues.apptools.activities;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.R;

public class AboutActivity extends AppCompatActivity implements CommonColors {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setNaviBarColor();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Toast.makeText(activity, description, Toast.LENGTH_LONG).show();
            }
        });
        webView.loadUrl("http://google.pl");
        setContentView(webView);
    }

    @Override
    public void setNaviBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }
}
