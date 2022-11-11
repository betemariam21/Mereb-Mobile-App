package com.example.merebe.mezemure;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mebreb.R;

public class M19 extends AppCompatActivity {

    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m19);
        music = MediaPlayer.create(this,R.raw.enamesgenamanuelen);
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
    @Override
    public void onBackPressed() {
        music.pause();
        finish();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                music.pause();
                finish();
                break;
        }
        return true;
    }
}
