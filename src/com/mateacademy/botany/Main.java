package com.mateacademy.botany;

public class Main {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        System.out.println(flowerStore.sell(1, 6, 2));
        System.out.println(flowerStore.getPurse());
        System.out.println(flowerStore.sellSequence(7, 2, 8));
        System.out.println(flowerStore.getPurse());
    }
}
