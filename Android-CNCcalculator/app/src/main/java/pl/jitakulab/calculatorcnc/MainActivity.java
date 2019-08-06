package pl.jitakulab.calculatorcnc;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import pl.jitakulab.calculatorcnc.fragments.AboutFragment;
import pl.jitakulab.calculatorcnc.fragments.CalcCNCFragment;
import pl.jitakulab.calculatorcnc.fragments.CalcStandardFragment;
import pl.jitakulab.calculatorcnc.fragments.ConverterFragment;
import pl.jitakulab.calculatorcnc.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNaviBarColor();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new CalcStandardFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_calc);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.nav_calc:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CalcStandardFragment()).commit();
                break;
            case R.id.nav_calc_cnc:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new CalcCNCFragment()).commit();
                break;
            case R.id.nav_converter:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ConverterFragment()).commit();
                break;
            case R.id.nav_threads:
                Toast.makeText(this, "Please wait for update. Work in progress...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_tolerances:
                Toast.makeText(this, "Please wait for update. Work in progress...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_gcodes:
                Toast.makeText(this, "Please wait for update. Work in progress...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_calc_formulas:
                Toast.makeText(this, "Please wait for update. Work in progress...", Toast.LENGTH_SHORT).show();
                break;
//            case R.id.nav_settings:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                        new SettingsFragment()).commit();
//                break;
            case R.id.nav_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AboutFragment()).commit();
                break;
        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else
            super.onBackPressed();
    }

    public void setNaviBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            getWindow().setNavigationBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
    }
}
