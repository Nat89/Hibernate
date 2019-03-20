public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;

    }

    public abstract void eat();
    public abstract void move();
    public void sayHi(){

    System.out.println("Hello, my name is: " + name);

}
}
