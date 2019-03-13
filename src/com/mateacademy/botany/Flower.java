package com.mateacademy.botany;

public abstract class Flower {
    private int price;

    public Flower(int price) {
        this.price = price;
    }

    public Flower() {

    }

    public int getPrice() {
        return price;
    }
}
