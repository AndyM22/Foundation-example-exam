package com.company;

import java.util.Random;

public class Cat extends Animal {

    private Random random = new Random();

    Cat(){
        super("Cat");
        super.setHealCost(this.random.nextInt(6));
    }

    Cat(String name){
        super(name);
        super.setHealCost(this.random.nextInt(6));
    }

}
