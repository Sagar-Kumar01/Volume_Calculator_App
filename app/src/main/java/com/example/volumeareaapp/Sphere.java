package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Sphere extends AppCompatActivity {

    TextView answer,info;
    EditText input;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        answer = findViewById(R.id.answer);
        info = findViewById(R.id.info);
        input = findViewById(R.id.input);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = input.getText().toString();

                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                int r = Integer.parseInt(radius);

                // V = (4/3) * pi * r^3

                double volume = (4/3) * 3.14159 * (r*r*r);
                String formattedNumber = decimalFormat.format(volume);
                answer.setText("V = "+formattedNumber+" m^3");
            }
        });

    }
}