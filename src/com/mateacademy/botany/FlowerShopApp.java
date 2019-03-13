package com.mateacademy.botany;

public class FlowerShopApp {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        flowerStore.sell(1, 2, 1);
        flowerStore.displayBouquet();
        System.out.println(flowerStore.getPurse());
        flowerStore.sellSequence(2, 2, 2);
        flowerStore.displayBouquet();
        System.out.println(flowerStore.getPurse());
    }
}
