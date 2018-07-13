package com.example.ycm.recyclerviewtest;

/**
 * Created by YCM on 2018/7/13.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
