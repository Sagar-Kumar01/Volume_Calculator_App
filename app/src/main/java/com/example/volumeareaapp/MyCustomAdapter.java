package com.example.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

  private ArrayList<Shape> shapeArrayList;
  Context context;

    public MyCustomAdapter(ArrayList<Shape> shapeArrayList, Context context1) {
        super(context1,R.layout.item_layout,shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context1;
    }
    private static class MyViewHolder{
        TextView shapename;
        ImageView shapeimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape = getItem(position);

        MyViewHolder myViewHolder;

        if(convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.item_layout,parent,false);

            myViewHolder.shapename = (TextView) convertView.findViewById(R.id.shapename);
            myViewHolder.shapeimage = (ImageView) convertView.findViewById(R.id.shape);

            convertView.setTag(myViewHolder);
        }else{
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        myViewHolder.shapename.setText(shape.getShapeName());
        myViewHolder.shapeimage.setImageResource(shape.getShapeImage());
        return convertView;
    }
}
