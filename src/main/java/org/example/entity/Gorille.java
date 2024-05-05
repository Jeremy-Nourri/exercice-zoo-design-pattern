package org.example.entity;

public class Gorille extends Primate {
    @Override
    public void crier() {
        System.out.println("Je suis un gorille, je crie");
    }

    @Override
    public void grimper() {
        System.out.println("Je suis un gorille, je grimpe aux arbres");
    }
}
