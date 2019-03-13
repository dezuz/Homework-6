package com.mateacademy.botany;

public class FlowerShopApp {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        flowerStore.sell(1, 6, 2);
        System.out.println(flowerStore.getPurse());
        flowerStore.sellSequence(7, 2, 8);
        System.out.println(flowerStore.getPurse());
    }
}
