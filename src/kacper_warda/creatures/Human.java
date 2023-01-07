package kacper_warda.creatures;

import kacper_warda.creatures.Animal;
import kacper_warda.devices.Car;
import kacper_warda.devices.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    public Car car;
    Phone phone;
    Animal pet;
    Double salary;
    public Double cash;

    public Human(String firstName){
        super("homo sapiens");
        this.weight = 70.0;
        this.salary = 0.0;
        this.firstName = firstName;
    }
}
