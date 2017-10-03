package com.example.james.navigationdrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mToggle;
    private Toolbar toolbar;
    GridView gridview;

    public static String[] osNameList = {
            "YouTube",
            "Facebook",
            "twitter",
            "Instagram",
            "WhatsApp",
            "IMDB",
            "Tubidy",
            "WhatsApp",
            "IMDB",
            "Tubidy",
            "one ",
            "Tubidy",
            "google+",
    };
    public static int[] osImages = {
            R.drawable.youtube,
            R.drawable.facebook,
            R.drawable.twitter_hdpi,
            R.drawable.youtube,
            R.drawable.whatsapp,
            R.drawable.youtube,
            R.drawable.whatsapp,
            R.drawable.youtube,
            R.drawable.youtube,
            R.drawable.whatsapp,
            R.drawable.download,
            R.drawable.batman1,
            R.drawable.googleplus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = (GridView) findViewById(R.id.customgrid);
        gridview.setAdapter(new CustomAdapter(this, osNameList, osImages));
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle =new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView mNavigationView = (NavigationView) findViewById(R.id.navigation_view);

        if (mNavigationView != null) {
            mNavigationView.setNavigationItemSelectedListener(this);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mDrawerList.bringToFront();
        mDrawerLayout.requestLayout();

        int id = item.getItemId();

        if (id == R.id.settings)
        {
            Intent intent =new Intent(this,Settings.class);
            startActivity(intent);
            Toast.makeText(this, "you clicked",Toast.LENGTH_SHORT).show();

        }


        mDrawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }}


