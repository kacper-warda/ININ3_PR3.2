package kacper_warda.devices;

import java.net.URL;
import java.util.List;

public class Phone extends Device {
    private static final String DEFAULT_APP_VERSION = "latest-stable";
    private static final String DEFAULT_APP_SERVER = "https://kacper-apps.com";
    public Double screenSize;
    public String os;


    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public void installAnApp(List<String> apps) {
        for (String appName : apps) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }

    public void installAnApp(String appName, String version, String server) {
        System.out.println("pobieram");
        System.out.println("sprawdzam miejsce");
        System.out.println("sprawdzam kontrole rodzicielską");
        System.out.println("ups, nie możesz zainstalować");
        //wypisanie co dokładnie instaluje
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("widzę logo");
        System.out.println("czekam");
        System.out.println("działa");
    }

}
