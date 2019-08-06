package com.domain.wues.apptools.activities;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.domain.wues.apptools.CommonColors;
import com.domain.wues.apptools.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsActivity extends AppCompatActivity implements CommonColors {

    final private int MULTIPLE_PERMISSIONS = 12345;
    private ListView listView;
    private String[] activities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setNaviBarColor();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ToolsActivity.this, NoteActivity.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            insertPermissionsWrapper();
        }

        listView = findViewById(R.id.listView);
        initResources();
        initActivitiesListView();
    }

    private void initResources(){
        Resources resources = getResources();
        activities = resources.getStringArray(R.array.activities);
    }

    private void initActivitiesListView(){
        listView.setAdapter(new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                activities
        ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                toolsClick(i);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case MULTIPLE_PERMISSIONS:
            {
                Map<String, Integer> perms = new HashMap<>();
                perms.put(Manifest.permission.WRITE_EXTERNAL_STORAGE, PackageManager.PERMISSION_GRANTED);
                perms.put(Manifest.permission.READ_EXTERNAL_STORAGE, PackageManager.PERMISSION_GRANTED);

                for (int i = 0; i<permissions.length; i++)
                    perms.put(permissions[i], grantResults[i]);

                if (perms.get(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                        && perms.get(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(ToolsActivity.this, "Nie przydzielono któregoś pozwolenia", Toast.LENGTH_SHORT).show();
                }
            }
            break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void insertPermissionsWrapper() {
        List<String> permissionsNeeded = new ArrayList<>();
        final List<String> permissionsList = new ArrayList<>();

        if (!addPermission(permissionsList, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            permissionsNeeded.add("zapisu pamięci wewnętrznej");
        }
        if (!addPermission(permissionsList, Manifest.permission.READ_EXTERNAL_STORAGE)) {
            permissionsNeeded.add("odczytu pamięci wewnętrznej");
        }

        if (permissionsList.size()>0) {
            if (permissionsNeeded.size()>0) {
                String message = "Potrzebny dostęp do " + permissionsNeeded.get(0);
                for (int i = 1; i<permissionsNeeded.size(); i++) {
                    message = message + ", " + permissionsNeeded.get(i);
                }
                message = message + " celem prawidłowego działania aplikacji";
                showMessageOKCancel(message, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        requestPermissions(permissionsList.toArray(new String[permissionsList.size()]), MULTIPLE_PERMISSIONS);
                    }
                });
                return;
            }
            requestPermissions(permissionsList.toArray(new String[permissionsList.size()]), MULTIPLE_PERMISSIONS);
            return;
        }
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener){
        new AlertDialog.Builder(ToolsActivity.this)
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Anuluj", null)
                .create()
                .show();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private boolean addPermission(List<String> permissionsList, String permission){
        if (checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
            permissionsList.add(permission);
            return shouldShowRequestPermissionRationale(permission);
        }
        return true;
    }

    @Override
    public void setNaviBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }

    public void toolsClick(int pos) {
        Intent intent;
        switch (pos) {
            case 0:
                intent = new Intent(ToolsActivity.this, ReadNotesActivity.class);
                break;
            case 1:
                intent = new Intent(ToolsActivity.this, CountdownActivity.class);
                break;
            case 2:
                intent = new Intent(ToolsActivity.this, PrimeNumberActivity.class);
                break;
            case 3:
                intent = new Intent(ToolsActivity.this, LevelActivity.class);
                break;
            case 4:
                intent = new Intent(ToolsActivity.this, DrawActivity.class);
                break;
            case 5:
                intent = new Intent(ToolsActivity.this, CameraActivity.class);
                break;
                default:
                    intent = new Intent(ToolsActivity.this, CameraActivity.class);
                    break;

        }
        startActivity(intent);
    }

}
