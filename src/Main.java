import devices.Car;
import devices.Device;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Car passat = new Car("VW", "Passat", 2010);
        Phone phone = new Phone("Apple", "6S", 2018);

        System.out.println(passat);
        System.out.println(phone);

        passat.turnOn();
        phone.turnOn();

    }
}