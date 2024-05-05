package org.example.entity;

public class Magot extends Primate{
    @Override
    public void crier() {
        System.out.println("Je suis un magot, je crie");
    }

    @Override
    void grimper() {
        System.out.println("Je suis un magot, je grimpe");
    }
}
