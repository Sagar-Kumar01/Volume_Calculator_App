package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    EditText ll,bb,hh;
    Button calculate;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        ll = findViewById(R.id.ll);
        bb = findViewById(R.id.bb);
        hh = findViewById(R.id.hh);

        calculate = findViewById(R.id.calculate);
        answer = findViewById(R.id.answer);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String l = ll.getText().toString();
                String b = bb.getText().toString();
                String h = hh.getText().toString();
                int hi = Integer.parseInt(h);
                int br = Integer.parseInt(b);
                int le = Integer.parseInt(l);

                int ans = le*br*hi;

                answer.setText(String.valueOf(ans));
            }
        });

    }
}