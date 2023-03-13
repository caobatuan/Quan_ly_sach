package com.example.quan_ly_sach;

public class Book {
    private int resouceImage;
    private String name;

    public Book(int resouceImage, String name) {
        this.resouceImage = resouceImage;
        this.name = name;
    }

    public int getResouceImage() {
        return resouceImage;
    }

    public void setResouceImage(int resouceImage) {
        this.resouceImage = resouceImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
