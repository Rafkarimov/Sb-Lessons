package main.home033.animals;

public abstract class Mammal extends Animal {
    //второй вариант вызов через конструктор
    protected Mammal() {
        System.out.println("Mammal is created");
        viviparous();
    }

    private void viviparous() {
        System.out.println(this.getClass().getSimpleName() + " is viviparous");
    }
}
