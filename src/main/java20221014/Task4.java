package main.java20221014;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Введите площадь круга: ");
        Scanner scanner = new Scanner(System.in);
        double square = scanner.nextDouble();

        double diameter = Math.sqrt(square * 4 / Math.PI);
        double length = Math.PI * diameter;

        System.out.println("Diameter: " + diameter + " length:" + length);
    }

}
