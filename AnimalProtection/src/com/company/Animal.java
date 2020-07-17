package com.company;

public class Animal {

    private String ownerName;
    private boolean isHealthy = false;
    private int healCost;
    private String name = "Animal";

    Animal(){

    }

    Animal(String name) {
        this.name = name;
    }

    public int getHealCost() {
        return this.healCost;
    }

    public void setHealCost(int healCost) {
        this.healCost = healCost;
    }

    public boolean isHealthy() {
        return this.isHealthy;
    }

    public String getName() {
        return this.name;
    }

    public void heal() {
        this.isHealthy = true;
    }

    public boolean isAdoptable() {
        return this.isHealthy;
    }

    public String toString() {
        if (isAdoptable()) {
            return this.name + " is healthy, and adoptable";
        }
        return this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
    }

}
