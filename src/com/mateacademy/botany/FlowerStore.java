package com.mateacademy.botany;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {
    private List<? super Flowers> bouquet;
    private int purse;

    public List<? super Flowers> sell(int rosesNumber, int chamomilesNumber, int tulipsNumber) {
        bouquet = new ArrayList<>();
        for (int i = 0; i < rosesNumber; i++) {
            setBouquet(new Roses());
        }
        for (int i = 0; i < chamomilesNumber; i++) {
            setBouquet(new Chamomiles());
        }
        for (int i = 0; i < tulipsNumber; i++) {
            setBouquet(new Tulips());
        }
        addToPurse(rosesNumber, chamomilesNumber, tulipsNumber);

        return bouquet;
    }

    public List<? super Flowers> sellSequence(int rosesNumber, int chamomilesNumber, int tulipsNumber) {
        bouquet = new ArrayList<>();
        int maxNumber = (rosesNumber > chamomilesNumber && rosesNumber > tulipsNumber) ? rosesNumber
                : (chamomilesNumber > tulipsNumber) ? chamomilesNumber : tulipsNumber;
        int firstNumber = rosesNumber, secondNumber = chamomilesNumber, thirdNumber = tulipsNumber;
        do {
            if (firstNumber > 0) {
                setSequenceBouquet(new Roses());
                firstNumber--;
            }
            if (secondNumber > 0) {
                setSequenceBouquet(new Chamomiles());
                secondNumber--;
            }
            if (thirdNumber > 0) {
                setSequenceBouquet(new Tulips());
                thirdNumber--;
            }
            maxNumber--;
        } while (maxNumber > 0);
        addToPurse(rosesNumber, chamomilesNumber, tulipsNumber);

        return bouquet;
    }

    public int getPurse() {
        return this.purse;
    }

    private <T> void setBouquet(T type) {
        bouquet.add((Flowers)type);
    }

    private <T> void setSequenceBouquet(T  type) {
        bouquet.add((Flowers)type);
    }

    private void addToPurse(int rosesNumber, int chamomilesNumber, int tulipsNumber) {
        this.purse += rosesNumber * Roses.getPrice() + chamomilesNumber * Chamomiles.getPrice()
                + tulipsNumber * Tulips.getPrice();
    }
}
