package main.home033.animals;

public class Eagle extends Bird implements Flying {
    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying fast");
    }
}
