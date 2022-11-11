package com.example.merebe;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.io.File;

public class Admin_dash extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
Button b1;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;
ImageButton Ib1,Ib2,Ib3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dash);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        textView = findViewById(R.id.textView);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.Open_Drawer, R.string.Close_Drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);
    Ib1 = findViewById(R.id.imageButton7);
    Ib2 = findViewById(R.id.imageButton6);
    Ib3 = findViewById(R.id.imageButton5);
    Ib1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), eventb.class));
        }
    });
        Ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Announcement.class));
            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
        case R.id.nav_home:
        break;
        case R.id.e1:
        Intent intent = new Intent(Admin_dash.this,eventb.class);
        startActivity(intent);
        break;
        case R.id.share:

                ApplicationInfo api =getApplicationContext().getApplicationInfo();
                String apkpath = api.sourceDir;
                Intent intent5 = new Intent(Intent.ACTION_SEND);
                intent5.setType("application/vnd.android.package-archive");
                intent5.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(apkpath)));
                startActivity(Intent.createChooser(intent5,"ShareVia"));
                break;
            case R.id.nav_rate:
                Intent intent6 = new Intent(Admin_dash.this,AboutUs.class);
                startActivity(intent6);
                break;
    }
drawerLayout.closeDrawer(GravityCompat.START);
        return true;
}
}