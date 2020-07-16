package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();

        System.out.println(cat.getHealCost());

        Dog dog = new Dog();

        System.out.println(dog.getHealCost());

        Parrot parrot = new Parrot();
        System.out.println(parrot.getHealCost());

        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        animal.getName();

        System.out.println("toString");
        System.out.println(animal.toString());
        animal.heal();
        System.out.println(animal.toString());

        Animal animal4 = new Animal();
        System.out.println(animal4.isAdoptable());


        AnimalShelter shelter = new AnimalShelter();

        System.out.println(shelter.earnDonation(30));

        shelter.addAdopter("Johny");
        shelter.addAdopter("Kuba");
        shelter.addAdopter("Pavla");

        shelter.rescue(animal);
        shelter.rescue(animal1);
        shelter.rescue(animal2);
        shelter.rescue(animal3);

        System.out.println("before");
        System.out.println(shelter.getAnimals().size());
        System.out.println(shelter.getAdoptersName().size());

        System.out.println(shelter.findNewOwner());

        System.out.println("after");
        System.out.println(shelter.getAnimals().size());
        System.out.println(shelter.getAdoptersName().size());

        System.out.println("Number of healed animal is: " + shelter.heal());



    }
}
