package main.home033.animals;

public abstract class Animal {
    protected Animal() {
        System.out.println("Animal is created");
    }

    protected void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating"); // тут будет напечатано название конкретного
        // класса например Bat ... и тд. .getSimpleName() - убирает наименования пакета.
    }

    protected void sleep() {
        System.out.println(this.getClass().getSimpleName() + " is sleeping");
    }
}
