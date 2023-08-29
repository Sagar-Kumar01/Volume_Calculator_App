package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class cube extends AppCompatActivity {

    EditText input;
    Button calculate;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        input = findViewById(R.id.input);
        calculate = findViewById(R.id.calculate);
        answer = findViewById(R.id.answer);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String in = input.getText().toString();
                int inn = Integer.parseInt(in);

                int ans = inn*inn*inn;

                answer.setText(" "+ans+" ");
            }
        });
    }
}