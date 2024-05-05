package org.example.subjects;

import org.example.entity.Animal;
import org.example.entity.Felin;
import org.example.entity.Oiseau;
import org.example.entity.Primate;
import org.example.factory.*;
import org.example.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Subject{

    private List<Observer> observers = new ArrayList<>();

    private List<Animal> animals = new ArrayList<>();

    private static Zoo instance = null;

    private Zoo() {
    }

    public synchronized static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
        System.out.println( "Vous avez été ajouté à la liste d'abonnés.");
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
        System.out.println( "Vous avez été retiré de la liste d'abonnés.");
    }

    @Override
    public void notifyObservers(Animal animal) {
        for (Observer observer : observers) {
            observer.update(animal);
        }
    }

    public void addAnimal(String type, String continent) {
        AnimalFactory factory;
        try {
            switch (continent) {
                case "Afrique":
                    factory = new AnimalAfricainFactory();
                    break;
                case "Amerique":
                    factory = new AnimalAmericainFactory();
                    break;
                case "Europe":
                    factory = new AnimalEuropeenFactory();
                    break;
                default:
                    throw new IllegalArgumentException("Continent inconnu ou non pris en charge.");
            }
            switch (type) {
                case "Felin" -> animals.add(factory.creerFelin());
                case "Oiseau" -> animals.add(factory.creerOiseau());
                case "Primate" -> animals.add(factory.creerPrimate());
                default -> throw new IllegalArgumentException("Type d'animal inconnu ou non pris en charge.");
            }

            notifyObservers(animals.get(animals.size() - 1));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void visiteZoo() {
        for (Animal animal : animals) {
            System.out.println("Je suis un " + animal.getClass().getSimpleName());

            if (animal instanceof Felin) {
                System.out.println("Je suis un felin");
            } else if (animal instanceof Oiseau) {
                System.out.println("Je suis un oiseau");
            } else if (animal instanceof Primate) {
                System.out.println("Je suis un primate");
            }

            System.out.println("Je viens de " + animal.getContinent());
            System.out.println("- - - - - - - - - - - - - - - - - -");
        }
    }
}