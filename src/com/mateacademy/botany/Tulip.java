package com.mateacademy.botany;

public class Tulip extends Flower {

    public Tulip() {
        super(45);
    }

    public Tulip(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
