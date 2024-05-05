package org.example.factory;

import org.example.entity.*;

public class AnimalEuropeenFactory extends AnimalFactory{

    public AnimalEuropeenFactory() {
        this.continent = "Europe";
    }

    @Override
    public Felin creerFelin() {
        Felin lynx = new Lynx();
        lynx.setContinent(continent);
        return lynx;
    }

    @Override
    public Primate creerPrimate() {
        Primate magot = new Magot();
        magot.setContinent(continent);
        return magot;
    }

    @Override
    public Oiseau creerOiseau() {
        Oiseau Goeland = new Goeland();
        Goeland.setContinent(continent);
        return Goeland;
    }
}
