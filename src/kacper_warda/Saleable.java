package kacper_warda;

import kacper_warda.creatures.Human;

public interface Saleable {
    void sell(Human seller, Human buyer, Double price);
}
