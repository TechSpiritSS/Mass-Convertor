package com.example.massconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class stonePound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stone_pound);

        EditText editText1 = findViewById(R.id.editInput1);
        EditText editText2 = findViewById(R.id.editInput2);

        Button convertStone = findViewById(R.id.buttonStones);
        convertStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double stone = Double.valueOf(editText1.getText().toString());
                double lbs = stone * 12.70058636;
                DecimalFormat decimalFormat = new DecimalFormat("#######.#####");
                editText2.setText(decimalFormat.format(lbs));
            }
        });
        Button convertLBS = findViewById(R.id.buttonLbs);
        convertLBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double lbs = Double.valueOf(editText2.getText().toString());
                double stone = lbs / 12.70058636;
                DecimalFormat decimalFormat = new DecimalFormat("#######.#####");
                editText1.setText(decimalFormat.format(stone));
            }
        });

    }
}