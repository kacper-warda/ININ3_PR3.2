package kacper_warda.creatures;

import kacper_warda.creatures.Animal;
import kacper_warda.devices.Car;
import kacper_warda.devices.Phone;

public class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 3;
    private static final Double DEFAULT_HUMAN_WEIGHT = 70.0;
    private static final Double DEFAULT_START_SALARY = 0.0;
    private static final String HUMAN_SPECIES = "homo sapiens";

    String firstName;
    String lastName;
    public Car[] garage;
    Phone phone;
    Animal pet;
    Double salary;
    public Double cash;

    public Human(String firstName) {
        super(HUMAN_SPECIES);
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.salary = DEFAULT_START_SALARY;
        this.firstName = firstName;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, Integer garageSize) {
        super(HUMAN_SPECIES);
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.salary = DEFAULT_START_SALARY;
        this.firstName = firstName;
        this.garage = new Car[garageSize];
    }

    public void setCar(Car newCar, Integer parkingLotNumber) {
        if (parkingLotNumber >= this.garage.length) {
            System.out.println("sorry, nie mamy tak dużego garażu");
        } else if (parkingLotNumber < 0) {
            System.out.println("chyba coś ci na łeb upadło");
        } else if (this.garage[parkingLotNumber] != null) {
            System.out.println("sorry miejsce zajęte");
        } else {
            this.garage[parkingLotNumber] = newCar;
        }
    }

    public Double getValueOfAllCars() {
        Double valueOfCars = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                valueOfCars += this.garage[i].value;
            }
        }
        return valueOfCars;
    }
}
