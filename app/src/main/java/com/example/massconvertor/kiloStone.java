package com.example.massconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class kiloStone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilo_stone);

        EditText editText1 = findViewById(R.id.editInput1);
        EditText editText2 = findViewById(R.id.editInput2);

        Button convertKG = findViewById(R.id.buttonKG);
        convertKG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kg = Double.valueOf(editText1.getText().toString());
                double stone = kg * 0.15747;
                DecimalFormat decimalFormat = new DecimalFormat("#######.#####");
                editText2.setText(decimalFormat.format(stone));
            }
        });
        Button convertStone = findViewById(R.id.buttonStones);
        convertStone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double stone = Double.valueOf(editText2.getText().toString());
                double kg = stone / 0.15747;
                DecimalFormat decimalFormat = new DecimalFormat("#######.#####");
                editText1.setText(decimalFormat.format(kg));
            }
        });
    }
}