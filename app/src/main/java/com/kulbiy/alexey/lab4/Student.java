package com.kulbiy.alexey.lab4;

public class Student {
    String name;
    int picture;

    public Student(String name, int pictureId) {
        this.name = name;
        this.picture = pictureId;
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
}
