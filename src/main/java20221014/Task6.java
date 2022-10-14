package main.java20221014;

import java.util.Scanner;

public class Task6 {
    final static double GALONS = 0.219969;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество литров: ");
        int n = scanner.nextInt();

        System.out.println("Количество галонов: " + n * GALONS);
    }
}
