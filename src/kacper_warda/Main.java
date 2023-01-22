package kacper_warda;

import kacper_warda.creatures.Animal;
import kacper_warda.creatures.Human;
import kacper_warda.devices.Car;
import kacper_warda.devices.Phone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("kacper");
        Car ford = new Car("ford", "focus", 2019);
        ford.value = 50000.0;
        Car fiat = new Car("fiat", "126p", 1999);
        fiat.value = 1000.0;

        me.setCar(ford, 0);
        me.setCar(fiat, 2);

        System.out.println("jaka jest wartość wszystkich aut?");
        System.out.println(me.getValueOfAllCars() + " zł");
    }
}