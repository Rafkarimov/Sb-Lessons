package main.java20221014;

import java.util.Scanner;

public class Task10 {
    /*
    Даны целые числа a, b и с, определяющие квадратное уравнение.
        Вычислить корни уравнения. ах^2+bx + c =0 , x1 = (-b - Math.sqrt(D))/(2*a), x2 = (-b + Math.sqrt(D))/(2*a).
        Гарантируется, что в тестовых данных у всех уравнений есть решение.
        Если у уравнения одно решение (полный квадрат), ваша программа все равно должна вывести два решения, просто одинаковых.

        Входные данные
        a = 9 b = -96 с = 30
        Выходные данные
        x1 = 0.322 x2 = 10.344

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные a: ");
        int a = scanner.nextInt();

        System.out.println("Введите данные b: ");
        int b = scanner.nextInt();

        System.out.println("Введите данные c: ");
        int c = scanner.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);

        System.out.println("Корень x1: " + x1 + "Корень x2: " + x2);
        System.out.printf("Корень x1: %.3f Корень x2: %.3f", x1, x2);

    }
}
