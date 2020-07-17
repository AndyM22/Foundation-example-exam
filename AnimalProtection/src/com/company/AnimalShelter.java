package com.company;

import java.util.ArrayList;
import java.util.Random;

public class AnimalShelter {

    private int budget = 50;
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<String> adoptersName = new ArrayList<>();
    private Random random = new Random();

    AnimalShelter() {

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

    public int heal() {
        for (int i = 0; i < this.animals.size(); i++) {
            Animal currentAnimal = this.animals.get(i);
            if ((currentAnimal.isHealthy() == false) && (currentAnimal.getHealCost() < this.budget)) {
                currentAnimal.heal();
                this.budget -= currentAnimal.getHealCost();
                return 1;
            }
        }
        return 0;
    }

    public void addAdopter(String name) {
        this.adoptersName.add(name);
    }

    public String findNewOwner() {

        ArrayList<Animal> adoptableAnimals = new ArrayList<>();

        for (int i = 0; i < this.animals.size(); i++) {
            Animal currentAnimal = this.animals.get(i);
            if (currentAnimal.isAdoptable()) {
                adoptableAnimals.add(currentAnimal);
            }
        }

        if ((adoptableAnimals.size() != 0) && (this.adoptersName.size() != 0)) {

            Animal animal = adoptableAnimals.get(this.random.nextInt(adoptableAnimals.size()));
            this.animals.remove(animal);
            String ownerName = this.adoptersName.get(this.random.nextInt(this.adoptersName.size()));
            this.adoptersName.remove(ownerName);
            return animal.getName() + " + " + ownerName;

        } else {
            return "Not enough animals or adopters";
        }

    }

    public String earnDonation(int number) {
        this.budget = this.budget + number;
        return "Budget: " + this.budget + " €";
    }

    public String toString() {

        String adoptableAnimals = "";
        String undoptableAnimals = "";

        for (int i = 0; i < this.animals.size(); i++) {
            Animal currentAnimal = this.animals.get(i);
            if (currentAnimal.isAdoptable()) {
                String isAdoptable = currentAnimal.getName() + " is healthy and adoptable\n";
                adoptableAnimals = adoptableAnimals.concat(isAdoptable);
            } else {
                String isNotAdoptable = currentAnimal.getName() + " is not healthy (healing would cost: " + currentAnimal.getHealCost() + " €) and not adoptable\n";
                undoptableAnimals = undoptableAnimals.concat(isNotAdoptable);
            }
        }

        return "Budget: " + this.budget + "€,\n" + "There are " + this.animals.size() + " animal(s) and " + this.adoptersName.size() + " potential adopter(s)\n" + undoptableAnimals + adoptableAnimals;

    }
}
