package main.home033.animals;

public class Dolphin extends Mammal implements Swimming {
    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming fast");
    }
}
