package com.example.merebe.mezemure;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mebreb.R;

public class M50 extends AppCompatActivity {
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m50);
        music = MediaPlayer.create(this,R.raw.marron);
        getSupportActionBar().setTitle("Merebe");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back22);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void play(View V){
        music.start();

    }
    public void pause(View V){
        if(music.isPlaying()){
            music.pause();

        }
    }
}
