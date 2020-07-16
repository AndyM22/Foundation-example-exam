package com.company;

public class Dog extends Animal{

    private int max = 8;
    private int min = 1;

    int healCost = super.setHealCost((int) (Math.random() * (this.max - this.min + 1) + this.min));

    @Override
    public int getHealCost() {
        return this.healCost;
    }

}
