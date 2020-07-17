package com.company;

public class Dog extends Animal{

    private int max = 8;
    private int min = 1;

    Dog(){
        super("Dog");
        super.setHealCost((int) (Math.random() * (this.max - this.min + 1) + this.min));
    }

    Dog(String name){
        super(name);
        super.setHealCost((int) (Math.random() * (this.max - this.min + 1) + this.min));
    }

}
