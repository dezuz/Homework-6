package com.mateacademy.botany;

public class Chamomile extends Flower {

    public Chamomile() {
        super(70);
    }

    public Chamomile(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Chamomile";
    }
}
