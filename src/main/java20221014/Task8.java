package main.java20221014;

import java.util.Scanner;

public class Task8 {
    /*
    Вычислить доход работника за неделю.
    Прочитать из консоли данные количество рабочих часов в неделю, часовая ставка, налог.
    Параметры
    c - количество рабочих часов в неделю
    r - ставка за час
    t - налог

     */

    public static void main(String[] args) {
        final int PERCENT_AMOUNT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рабочих часов в неделю: ");
        int c = scanner.nextInt();

        System.out.println("Введите ставку работника за 1 час: ");
        double r = scanner.nextDouble();

        System.out.println("Введите налог: ");
        int t = scanner.nextInt();

        double salary = c * r - c * r * t / PERCENT_AMOUNT;
        System.out.println("Зарплата: " + salary);

    }
}
