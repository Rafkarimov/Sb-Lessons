package main.java104;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        // Получить целое число
        System.out.print("Введите целое число: ");
        number = input.nextInt();

        // Проверить на кратность и отобразить результат
        if (number % 5 == 0)
            System.out.println("Кратно 5");
        if (number % 2 == 0)
            System.out.println("Четное");
    }
}