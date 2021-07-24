package com.example.massconvertor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer clicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void start(View v)
    {
        clicks = MediaPlayer.create(this, R.raw.clicksound);
        clicks.start();
        Intent options = new Intent();
        options.setClass(this, Options.class);
        startActivity(options);
        finish();
    }
}