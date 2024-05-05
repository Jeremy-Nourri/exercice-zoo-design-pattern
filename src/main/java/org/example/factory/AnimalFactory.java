package org.example.factory;

import org.example.entity.Felin;
import org.example.entity.Oiseau;
import org.example.entity.Primate;

public abstract class AnimalFactory {

    String continent;

    public abstract Felin creerFelin();

    public abstract Primate creerPrimate();

    public abstract Oiseau creerOiseau();
}
