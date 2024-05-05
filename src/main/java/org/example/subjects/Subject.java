package org.example.subjects;

import org.example.entity.Animal;
import org.example.observers.Observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers(Animal animal);
}
