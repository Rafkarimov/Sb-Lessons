package main.home033.animals;

public abstract class Fish extends Animal {
    protected void spawn() {
        System.out.println(this.getClass().getSimpleName() + " is spawn");
    }
}
