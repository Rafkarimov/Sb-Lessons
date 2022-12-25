package main.java401dop;

import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Получить два целых числа
        System.out.print("Введите два целых числа: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " равно " +
                    (number1 / number2));
        else
            System.out.println("Делить на ноль нельзя!");
    }
}
