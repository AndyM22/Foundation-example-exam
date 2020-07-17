package com.company;

public class Parrot extends Animal {

    private int max = 10;
    private int min = 4;

    Parrot(){
        super("Parrot");
        super.setHealCost((int) (Math.random() * (this.max - this.min + 1) + this.min));

    }

    Parrot(String name){
        super(name);
        super.setHealCost((int) (Math.random() * (this.max - this.min + 1) + this.min));

    }

}
