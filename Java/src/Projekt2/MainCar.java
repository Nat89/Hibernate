package Projekt2;

public class MainCar {
    public static void main(String[] args) {
        Engine engine = new Engine (23);
        Body body = new Body (55);
        Wheels wheels = new Wheels(4, 7);
        Car c = new Car(engine, wheels, body);
        System.out.println(c.totalCost());
    }
}
