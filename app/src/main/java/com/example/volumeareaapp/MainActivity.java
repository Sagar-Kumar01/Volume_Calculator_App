package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView griditem;
    ArrayList<Shape> arrayList;
    private static MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        griditem = findViewById(R.id.gridView);
        arrayList = new ArrayList<>();

        Shape shape1 = new Shape(R.drawable.sphere,"sphere");
        Shape shape2 = new Shape(R.drawable.cylinder,"cylinder");
        Shape shape3 = new Shape(R.drawable.cube,"cube");
        Shape shape4 = new Shape(R.drawable.prism,"prism");

        arrayList.add(shape1);
        arrayList.add(shape2);
        arrayList.add(shape3);
        arrayList.add(shape4);

        adapter = new MyCustomAdapter(arrayList,getApplicationContext());
        griditem.setAdapter(adapter);
        griditem.setNumColumns(2);

        griditem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(adapter.getItem(position).shapeName == "sphere"){
                    Intent i = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(i);
                }else if(adapter.getItem(position).shapeName == "cylinder"){
                    Intent i = new Intent(getApplicationContext(), cylinder.class);
                    startActivity(i);
                }else if(adapter.getItem(position).shapeName == "cube"){
                    Intent i = new Intent(getApplicationContext(), cube.class);
                    startActivity(i);
                }else if(adapter.getItem(position).shapeName == "prism"){
                    Intent i = new Intent(getApplicationContext(), Prism.class);
                    startActivity(i);
                }
            }
        });

    }
}