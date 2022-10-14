package main.java20221014;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите количество гигабайт трафика: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("Введите стоимость трафика: ");
        int c = scanner.nextInt();

        System.out.println("Стоимость одного гигабайта трафика: " + (double)c * 1 / m );


    }
}
