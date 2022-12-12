package main.home033.animals;

public abstract class Bird extends Animal {
    protected void theyLayEggs() {
        System.out.println(this.getClass().getSimpleName() + " is they lay eggs");
    }
}
