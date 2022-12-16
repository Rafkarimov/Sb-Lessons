package main.java20221216.interfaces;

public class SuperHero implements CanSwim, CanFight, CanFly {
    @Override
    public void fight() {
        System.out.println("I am superhero. Fight!");
    }

    @Override
    public void swim() {
        System.out.println("I am superhero. Swim!");
    }

    @Override
    public void fly() {
        System.out.println("I am superhero. Fly!");
    }
}
