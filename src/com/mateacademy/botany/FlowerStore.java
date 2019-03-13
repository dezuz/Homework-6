package com.mateacademy.botany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlowerStore {
    private Flower[] bouquet;
    private int purse;
    private int arrayOrder;

    public Flower[] sell(int rosesNumber, int chamomilesNumber, int tulipsNumber) {
        int flowersNumber = rosesNumber + chamomilesNumber + tulipsNumber;
        bouquet = new Flower[flowersNumber];
        arrayOrder = 0;
        for (int i = 0; i < rosesNumber; i++) {
            setBouquet(new Rose(), arrayOrder++);
            addToPurse(new Rose());
        }
        for (int i = 0; i < chamomilesNumber; i++) {
            setBouquet(new Chamomile(), arrayOrder++);
            addToPurse(new Chamomile());
        }
        for (int i = 0; i < tulipsNumber; i++) {
            setBouquet(new Tulip(), arrayOrder++);
            addToPurse(new Tulip());
        }

        return bouquet;
    }

    public Flower[] sellSequence(int rosesNumber, int chamomilesNumber, int tulipsNumber) {
        int flowersNumber = rosesNumber + chamomilesNumber + tulipsNumber;
        bouquet = new Flower[flowersNumber];
        int maxNumber = (rosesNumber > chamomilesNumber && rosesNumber > tulipsNumber) ? rosesNumber
                : (chamomilesNumber > tulipsNumber) ? chamomilesNumber : tulipsNumber;
        int firstNumber = rosesNumber, secondNumber = chamomilesNumber, thirdNumber = tulipsNumber;
        arrayOrder = 0;
        do {
            if (firstNumber > 0) {
                setSequenceBouquet(new Rose(), arrayOrder++);
                addToPurse(new Rose());
                firstNumber--;
            }
            if (secondNumber > 0) {
                setSequenceBouquet(new Chamomile(), arrayOrder++);
                addToPurse(new Chamomile());
                secondNumber--;
            }
            if (thirdNumber > 0) {
                setSequenceBouquet(new Tulip(), arrayOrder++);
                addToPurse(new Tulip());
                thirdNumber--;
            }
            maxNumber--;
        } while (maxNumber > 0);

        return bouquet;
    }

    public void displayBouquet() {
        List<Flower> flowers = new ArrayList<>();
        flowers.addAll(Arrays.asList(bouquet));
        System.out.println(flowers);
    }

    public int getPurse() {
        return purse;
    }

    private void setBouquet(Flower type, int arrayOrder) {
        bouquet[arrayOrder] = type;
    }

    private void setSequenceBouquet(Flower type, int arrayOrder) {
        bouquet[arrayOrder] = type;
    }

    private void addToPurse(Flower type) {
        this.purse += type.getPrice();
    }
}
