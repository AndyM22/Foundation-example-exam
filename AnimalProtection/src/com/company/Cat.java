package com.company;

import java.util.Random;

public class Cat extends Animal {

    Random random = new Random();

    int healCost = super.setHealCost(this.random.nextInt(6));

    @Override
    public int getHealCost() {
        return this.healCost;
    }
}
