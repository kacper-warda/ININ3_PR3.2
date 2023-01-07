import devices.Car;
import devices.Device;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Device fridge = new Device("Amica", "A3492", 2012);
        Car car = new Car("VW", "Passat", 2010);
        Phone phone = new Phone("Apple", "6S", 2018);

        System.out.println(car);
        System.out.println(phone);

    }
}