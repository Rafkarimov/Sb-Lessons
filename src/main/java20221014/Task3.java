package main.java20221014;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Введите x: ");
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        System.out.println("Введите y: ");
        double y = scanner.nextDouble();

        double result = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Евклидово расстояние: " + result);
    }
}
