package CarExample;

import java.util.List;

public class Car {

private Engine engine;

private List<Wheel> wheels;

public Car(){

    engine = new Engine();
}

public void start(){
    System.out.println("Starting the car.");
    engine.start();
    System.out.println("car started.");
    System.out.println("Doors locked");
    System.out.println("Seatbelt beep turned on.");
    System.out.println("AC Turned on");
}

    public void stop() {

    engine.stop();
        System.out.println("Stopped the car");
    }
}
