package org.example.observers;

import org.example.entity.Animal;

import org.example.entity.Felin;
import org.example.entity.Oiseau;
import org.example.entity.Primate;

public class Visiteur implements Observer {

    private String nom;

    public Visiteur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(Animal animal) {
       System.out.println("Un nouvel animal a été ajouté au zoo : " + animal.getClass().getSimpleName());
         if (animal instanceof Felin) {
              ((Felin) animal).rugit();
         } else if (animal instanceof Oiseau) {
              ((Oiseau) animal).vole();
         } else if (animal instanceof Primate) {
              ((Primate) animal).crier();
         }
    }
}
