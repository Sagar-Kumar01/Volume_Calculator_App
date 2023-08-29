package com.example.volumeareaapp;

public class Shape {
    int shapeImage;
    String shapeName;

    public Shape(int shapeImage, String shapeName) {
        this.shapeImage = shapeImage;
        this.shapeName = shapeName;
    }

    public int getShapeImage() {
        return shapeImage;
    }

    public void setShapeImage(int shapeImage) {
        this.shapeImage = shapeImage;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}