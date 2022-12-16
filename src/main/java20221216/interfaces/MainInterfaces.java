package main.java20221216.interfaces;

public class MainInterfaces {
    public static void main(String[] args) {
        SuperHero superHero = new SuperHero();
        Archer archer = new Archer();

        archer.fight();
        superHero.fight();
        superHero.fly();
        superHero.swim();
    }
}
