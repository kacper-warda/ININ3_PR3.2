package kacper_warda;

import kacper_warda.creatures.Human;
import kacper_warda.devices.Car;
import kacper_warda.devices.Phone;

public class Main {
    public static void main(String[] args) {
        Car passat = new Car("VW", "Passat", 2010);
        Human me = new Human("Kacper");
        Human brotherInLow = new Human("Piotrek");
        me.car = passat;
        brotherInLow.cash = 9999.0;

        passat.sell(me, brotherInLow, 3000.0);

        //efekt jaki chcemy uzyskać:
        //me.car = null
        //brotherInLow.car = passat
        //me.cash = 3000.0
        //brotherInLow.cash = 6999.0

    }
}