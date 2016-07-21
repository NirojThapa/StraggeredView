package com.example.hassidiczaddic.staggeredview;

/**
 * Created by HassidicZaddic on 6/14/2016.
 */


public class ItemObjects {
    private String name;
    private int photo;

    public ItemObjects(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
