package com.example.tankwar.bean;

import android.view.View;

import com.example.tankwar.R;

import java.util.Vector;

public class Item {

    private float x;

    private float y;

//    private float width;
//
//    private float height;

    private int imageId;

    private boolean isStatic;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

//    public float getWidth() {
//        return width;
//    }
//
//    public void setWidth(float width) {
//        this.width = width;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public void setHeight(float height) {
//        this.height = height;
//    }

    public boolean isOnArea(Item item) {
        Vector2[] vector2s = new Vector2[4];
        vector2s[0] = new Vector2(item.getView().getLeft(), item.getView().getTop());
        vector2s[1] = new Vector2(item.getView().getRight(), item.getView().getTop());
        vector2s[2] = new Vector2(item.getView().getLeft(), item.getView().getBottom());
        vector2s[3] = new Vector2(item.getView().getRight(), item.getView().getBottom());
        for (Vector2 v :
                vector2s) {
            if (v.x >= this.getView().getLeft() && v.x <= this.getView().getRight() && this.getView().getTop() <= v.y && this.getView().getBottom() >= v.y) {
                return true;
            }
        }
        return false;
    }

    private View view;


    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
