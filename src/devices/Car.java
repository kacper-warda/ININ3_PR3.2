package devices;

public class Car extends Device {
    public Double millage;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.millage = 0.0;
    }

    public void drive() {
        this.millage += 10.0;
        System.out.println("Aktualny przebieg to: " + this.millage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "millage=" + millage +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("przekręcam kluczyk");
        System.out.println("modlę się w intencji akumulatora");
        System.out.println("odpala");
    }
}
