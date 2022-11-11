package com.example.merebe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_about_us);
        getSupportActionBar().setTitle("Merebe");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back22);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.logoy)
                .setDescription(" This application is build to faclitate communication between fellow members and leaders ")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("CONNECT WITH US!")
                .addEmail("betemariam216rfa@gmail.com")
                .addWebsite("https://betemariam21.000webhostapp.com/")
                .addGitHub("https://github.com/HackBet")
                .addTwitter("https://twitter.com/BetemariamAssa1")
                .addInstagram("https://www.instagram.com/beta216re/")
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by Betemariam", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutUs.this,copyrightString, Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}