package com.example.massconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class ounceGram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ounce_gram);

        EditText editText1 = findViewById(R.id.editInput1);
        EditText editText2 = findViewById(R.id.editInput2);

        Button convertGram = findViewById(R.id.buttonGram);
        convertGram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double g = Double.valueOf(editText1.getText().toString());
                double oz = g * 0.035274;
                DecimalFormat decimalFormat = new DecimalFormat("#######.#####");
                editText2.setText(decimalFormat.format(oz));
            }
        });
            Button convertOunce= findViewById(R.id.buttonOunce);
        convertOunce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oz = Double.valueOf(editText2.getText().toString());
                double g = oz / 0.035274;
                DecimalFormat decimalFormat = new DecimalFormat("#######.#####");
                editText1.setText(decimalFormat.format(g));
            }
        });
    }
}