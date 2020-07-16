package com.company;

import java.util.ArrayList;
import java.util.Random;

public class AnimalShelter {

    private int budget = 50;
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<String> adoptersName = new ArrayList<>();
    private Random random = new Random();

    AnimalShelter(){

    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<String> getAdoptersName() {
        return adoptersName;
    }

    public int rescue(Animal animal) {
        this.animals.add(animal);
        return this.animals.size();
    }

    public int heal(){
        int numberOfHealed = 0;
        for (int i = 0; i < this.animals.size(); i++) {
            if ((this.animals.get(i).isHealthy() != true) && (this.animals.get(i).getHealCost() < this.budget)){
                this.animals.get(i).heal();
                this.budget = this.budget - this.animals.get(i).getHealCost();
                numberOfHealed = 1;
            } else {
                numberOfHealed = 0;
            }
        } return numberOfHealed;
    }

    public void addAdopter(String name) {
        this.adoptersName.add(name);
    }

    public String findNewOwner() {
        Animal animal = this.animals.get(this.random.nextInt(this.animals.size()));
        this.animals.remove(animal);
        String animalName = this.animals.get(this.random.nextInt(this.animals.size())).getName();
        String ownerName = this.adoptersName.get(this.random.nextInt(this.adoptersName.size()));
        this.adoptersName.remove(ownerName);
        String newPair = animalName + " + " + ownerName;
        return newPair;
    }

    public int earnDonation(int number) {
        this.budget = this.budget + number;
        return this.budget;
    }

   /* public String toString(){
        String string = "Budget: " + this.budget + "€,\n" + "There are " + this.animals.size() + " animal(s) and " + this.adoptersName.size() + " potential adopter(s)\n" + this.animals.get(0).isHealthy();*/

}
