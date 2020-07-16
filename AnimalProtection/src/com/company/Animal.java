package com.company;

public class Animal {

    private String ownerName;
    private boolean isHealthy = false;
    private int healCost;
    private String name = "Animal";

    public int getHealCost() {
        return healCost;
    }

    public int setHealCost(int healCost) {
        this.healCost = healCost;
        return healCost;
    }

    public boolean isHealthy() {
        return this.isHealthy;
    }

    public String getName() {
        return name;
    }

    Animal(){
        this.isHealthy = false;
    }

    Animal(String name){
        this.name = name;
    }

    public void heal(){
        this.isHealthy = true;
    }

    public boolean isAdoptable(){
        return this.isHealthy;
    }

    public String toString(){
        if (this.isHealthy == true){
            String string = this.name + " is healthy, and adoptable";
            return string;
        } else {
            String string = this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
            return string;
        }
    }

}
