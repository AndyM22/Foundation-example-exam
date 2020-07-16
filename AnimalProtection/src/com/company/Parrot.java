package com.company;

public class Parrot extends Animal {

    private int max = 10;
    private int min = 4;

    int healCost = super.setHealCost((int) (Math.random() * (this.max - this.min + 1) + this.min));

    @Override
    public int getHealCost() {
        return this.healCost;
    }


}
