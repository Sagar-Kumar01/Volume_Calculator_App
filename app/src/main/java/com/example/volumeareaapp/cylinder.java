package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class cylinder extends AppCompatActivity {

    EditText r,h;
    TextView answer;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        r = findViewById(R.id.r);
        h = findViewById(R.id.h);
        answer = findViewById(R.id.answer);
        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                String rr = r.getText().toString();
                String hh = h.getText().toString();

                int inr = Integer.parseInt(rr);
                int ihh = Integer.parseInt(hh);

                double ans = 3.14159*(inr*inr)*ihh;
                String formattedNumber = decimalFormat.format(ans);
                answer.setText(" "+formattedNumber+" ");
            }
        });
    }
}