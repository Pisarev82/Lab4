package com.kulbiy.alexey.lab4;

public class Student {
    String name;
    int picture;
    int pictureBig;


    public Student(String name, int pictureId, int pictureBigId) {
        this.name = name;
        this.picture = pictureId;
        this.pictureBig = pictureBigId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getPictureBig() {
        return pictureBig;
    }

    public void setPictureBig(int pictureBig) {
        this.pictureBig = pictureBig;
    }
}
