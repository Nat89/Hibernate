package Projekt2;

public class Wheels extends Part {

    private  int numberOfWheels;
    public Wheels(int price, int numberOfWheels) {
        super (price);
        this.numberOfWheels = numberOfWheels;

    }

    public Wheels(int price) {
        super(price);
    }
}
