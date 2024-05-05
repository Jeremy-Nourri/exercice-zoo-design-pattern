package org.example.factory;

import org.example.entity.*;

public class AnimalAmericainFactory extends AnimalFactory{

    public AnimalAmericainFactory() {
        this.continent = "Amérique";
    }

    @Override
    public Felin creerFelin() {
        Felin puma = new Puma();
        puma.setContinent(continent);
        return puma;
    }

    @Override
    public Primate creerPrimate() {
        Primate ouistiti = new Ouistiti();
        ouistiti.setContinent(continent);
        return ouistiti;
    }

    @Override
    public Oiseau creerOiseau() {
        Oiseau toucan = new Toucan();
        toucan.setContinent(continent);
        return toucan;
    }
}
