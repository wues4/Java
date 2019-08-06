package com.domain.wues.apptools.activities;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.R;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.FilenameFilter;


public class ReadNotesActivity extends AppCompatActivity implements CommonColors {

    private TextView readNotes;
    private String path = Environment.getExternalStorageDirectory() + "/wues/AppTools/";
    private String interlude = "\n\n\n //////~~~~~~~//////~~~~~~~//////~~~~~~\n\n\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_notes);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setNaviBarColor();

        readNotes = findViewById(R.id.readNoteTV);
        readNotes.setText(getAllContent());
    }

    @Override
    public void setNaviBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }

    private String getAllContent(){

        try {
            File file = new File(path);
            String[] paths = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File file, String filename) {
                    return filename.endsWith(".txt");
                }
            });

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i<paths.length; i++) {
                sb.append(Files.toString(new File(path + paths[i]), Charsets.UTF_8));
                sb.append(interlude);
            }
            return sb.toString();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_LONG).show();
            return "";
        }
    }
}
