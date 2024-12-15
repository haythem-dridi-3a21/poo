// src/tn/esprit/gestionzoo/main/ZooManagment.java
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.entities.InvalidAgeException;
import tn.esprit.gestionzoo.entities.ZooFullException;


public class ZooManagment {
    public static void main(String[] args) throws InvalidAgeException, ZooFullException {
        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis", 3);
        Animal lion = new Animal("Félidé", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 10, false);
        Animal zebra = new Animal("Équidés", "Marty", 7, false);

        // Create
      zoo.addAnimal(lion);

         zoo.addAnimal(elephant);
      zoo.addAnimal(zebra);
       zoo.displayAnimals();

        System.out.println("****************************************************************************");

        // Read
        Animal firstAnimal = zoo.getAnimal(0);
        System.out.println("First animal: " + firstAnimal);


        // Update

        System.out.println("****************************************************************************");
        Animal updatedLion = new Animal("Félidé", "Simba", 6, true);
        zoo.updateAnimal(0, updatedLion);
        zoo.displayAnimals();

        System.out.println("****************************************************************************");

        // Delete
        zoo.deleteAnimal(1);
        zoo.displayAnimals();

        // Utilisation des constructeurs par défaut
        Dolphin dolphin = new Dolphin("Mammal", "Flipper", 5, true, "Ocean", 20.5f);
        Penguin penguin = new Penguin("Bird", "Pingu", 3, false, "Antarctic", 30.0f);
        Aquatic genericAquatic = new Aquatic("Fish", "Goldfish", 1, false, "Freshwater");
        Terrestrial terrestrial = new Terrestrial("Mammal", "Bear", 4, true, "Forest");

        // Ajout des animaux aquatiques au zoo
        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);
        zoo.addAquaticAnimal(genericAquatic);
        System.out.println("****************************************************************************");

        // Affichage des objets créés
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(genericAquatic);
        System.out.println(terrestrial);
        System.out.println("****************************************************************************");

        // Appel des méthodes swim
        genericAquatic.swim();
        dolphin.swim();
        penguin.swim();
        System.out.println("****************************************************************************");

        // Test des méthodes eat
        genericAquatic.eatMeat(Food.MEAT);
        terrestrial.eatMeat(Food.MEAT);
        terrestrial.eatPlant(Food.PLANT);
        terrestrial.eatPlantAndMeat(Food.BOTH);
    }
}