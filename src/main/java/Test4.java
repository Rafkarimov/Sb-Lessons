package main.java;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        final double PI = 3.14; // Вводим константу ПИ = 3,14

        double radius; // объявляем переменную типа double  - radius
        double circum; // длина окружности

        // делаем объект класса Scaner для ввода с консоли
        Scanner input = new Scanner(System.in);
        //применяем фабричный метод nextDouble() для ввода с консоли
        System.out.println("Введите радиус: ");
        radius = input.nextDouble();

        circum = 2 * PI * radius;

        System.out.println("Длина окружности = " + circum);
    }
}
