package org.example;

import org.example.observers.Visiteur;
import org.example.subjects.Zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Zoo zoo = Zoo.getInstance();

        System.out.println("Bienvenue au zoo !");

        System.out.println("Quel est votre nom ?");
        String nom = scanner.nextLine();
        Visiteur visiteur = new Visiteur(nom);
        visiteur.setNom(nom);
        System.out.println("Bonjour " + visiteur.getNom() + " !");

        String choix;

        do {
            System.out.println( "===========================================");
            System.out.println("Que souhaitez vous faire " + visiteur.getNom() + " ?");
            System.out.println("1. M'abonner pour recevoir les informations lors de l'ajout d'un animal");
            System.out.println("2. Me désabonner");
            System.out.println("3. Ajouter un animal");
            System.out.println("4. Visiter le zoo");
            System.out.println("0. Quitter le zoo");
            choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    zoo.register(visiteur);
                    break;
                case "2":
                    zoo.unregister(visiteur);
                    break;
                case "3":
                    System.out.println("Quel type d'animal voulez-vous ajouter ? (Felin/Oiseau/Primate)");
                    String type = scanner.nextLine();
                    System.out.println("De quel continent est originaire cet animal ? (Afrique/Amerique/Europe)");
                    String continent = scanner.nextLine();
                    zoo.addAnimal(type, continent);
                    break;
                case "4":
                    zoo.visiteZoo();
                    break;
                case "0":
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide");
            }


        } while (!choix.equals("0"));

    }
}