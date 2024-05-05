package org.example.factory;

import org.example.entity.*;

public class AnimalAfricainFactory extends AnimalFactory {

    public AnimalAfricainFactory() {
        this.continent = "Afrique";
    }

    @Override
    public Felin creerFelin() {
        Felin lion = new Lion();
        lion.setContinent(continent);
        return lion;
    }

    @Override
    public Primate creerPrimate() {
        Primate gorille = new Gorille();
        gorille.setContinent(continent);
        return gorille;
    }

    @Override
    public Oiseau creerOiseau() {
        Oiseau autruche = new Autruche();
        autruche.setContinent(continent);
        return autruche;
    }
}
