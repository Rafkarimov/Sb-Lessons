package main.home031.cat;

import java.security.SecureRandom;
import java.security.Security;
import java.util.Random;

/*
1.	Необходимо реализовать класс Cat.
У класса должны быть реализованы следующие приватные методы:
●	sleep() — выводит на экран “Sleep”
●	meow() — выводит на экран “Meow”
●	eat() — выводит на экран “Eat”
И публичный метод:
status() — вызывает один из приватных методов случайным образом.

 */
public class Cat {
    private final Random random = new SecureRandom();

    private void sleep() {
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        int num = random.nextInt(3);
        if (num == 0) {
            sleep();
        } else if (num == 1) {
            meow();
        } else {
            eat();
        }
    }
}
