package main.java20221014;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение: ");
        int n = scanner.nextInt();

        System.out.println("Число десятков равно: " + (n / 10));

        System.out.println("Количество единиц будет: " + (n % 10));

    }
}
