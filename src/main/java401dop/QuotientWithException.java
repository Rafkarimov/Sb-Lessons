package main.java401dop;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Делить на ноль нельзя!");

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Получить два целых числа
        System.out.print("Введите два целых числа: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " равно "
                    + result);
        }
        catch (ArithmeticException ex) {
            System.out.println("Исключение: целое число " +
                    "нельзя делить на ноль ");
        }

        System.out.println("Выполнение программы продолжается...");
    }
}
