package main.java104;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear;

        Scanner input = new Scanner(System.in);

        // Получить год
        System.out.print("Введите год: ");
        year = input.nextInt();

        // Определить, является ли год високосным
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Отобразить, является ли год високосным
        System.out.println(year + " год - високосный? " + isLeapYear);
    }
}