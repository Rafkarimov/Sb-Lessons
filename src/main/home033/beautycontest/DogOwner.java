package main.home033.beautycontest;

public class DogOwner {
    private final String name;

    public DogOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DogOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}
