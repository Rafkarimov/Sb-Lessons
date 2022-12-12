package main.home033.animals;

public class Bat extends Mammal implements Flying {
    public Bat() {
        System.out.println("Bat is created");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying slow");
    }
}
