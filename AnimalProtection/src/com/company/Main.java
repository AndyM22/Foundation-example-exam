package com.company;

public class Main {

    public static void main(String[] args) {

        Animal katka = new Cat("Katka");
        Animal johan = new Parrot("Johan");
        Animal lojza = new Dog("Lojza");

        AnimalShelter shelter = new AnimalShelter();

        System.out.println(shelter.earnDonation(30));

        shelter.addAdopter("Johny");
        shelter.addAdopter("Kuba");
        shelter.addAdopter("Pavla");

        shelter.rescue(katka);
        shelter.rescue(lojza);
        shelter.rescue(johan);

        System.out.println("Number of healed animal is: " + shelter.heal());
        System.out.println("Number of healed animal is: " + shelter.heal());

        System.out.println(shelter.toString());

        System.out.println(shelter.findNewOwner());
        System.out.println(shelter.findNewOwner());
        System.out.println(shelter.findNewOwner());
        System.out.println(shelter.findNewOwner());

    }
}
