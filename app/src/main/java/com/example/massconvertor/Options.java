package com.example.massconvertor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Options extends AppCompatActivity {

    MediaPlayer clicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        clicks = MediaPlayer.create(this, R.raw.clicksound);

        ListView optionsList = findViewById(R.id.optionsList);
        ArrayAdapter<CharSequence> adapterOptions = ArrayAdapter.createFromResource(this, R.array.options,
                android.R.layout.simple_list_item_1);
        optionsList.setAdapter(adapterOptions);

        optionsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                clicks.start();
                if (position == 0) {
                    Intent kiloPound = new Intent();
                    kiloPound.setClass(Options.this, kiloPound.class);
                    startActivity(kiloPound);
                }
                if (position == 1) {
                    Intent kiloStone = new Intent();
                    kiloStone.setClass(Options.this, kiloStone.class);
                    startActivity(kiloStone);
                }
                if (position == 2) {
                    Intent stonePound = new Intent();
                    stonePound.setClass(Options.this, stonePound.class);
                    startActivity(stonePound);
                }
                if (position == 3) {
                    Intent ounceGram = new Intent();
                    ounceGram.setClass(Options.this, ounceGram.class);
                    startActivity(ounceGram);
                }
            }
        });
    }
}