package Projekt2;

import java.util.List;

public class Car {
    private Engine engine;
    private Wheels wheels;
    private Body body;

    public Car(Engine engine, Wheels wheels, Body body) {
        this.engine = engine;
        this.wheels = wheels;
        this.body = body;
    }

    public int totalCost() {
        return engine.price()+ body.price()+ sumWheels();
    }

    private int sumWheels(){
       return wheels.price();
    }
}