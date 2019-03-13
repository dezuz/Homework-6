package com.mateacademy.botany;

public class Rose extends Flower {

    public Rose() {
        super(100);
    }

    public Rose(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Rose";
    }
}
