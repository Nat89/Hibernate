public class Elephant extends Animal {
    public Elephant (String name) {
        super(name)''
    }
    public void stomp() {
        System.out.println("Elephant stomp");

    }
    @Override
    public void eat() {
        System.out.println("Elephant is eating.");
    }
    @Override
    public void move() {
        System.out.println("Elephant is moving");
    }
}
