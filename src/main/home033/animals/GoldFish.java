package main.home033.animals;

public class GoldFish extends Fish implements Swimming {
    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming slow");
    }
}
