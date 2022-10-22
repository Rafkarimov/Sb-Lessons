package main.home01;

import java.util.Scanner;

/*
На вход подается баланс счета в банке – n. Рассчитайте дневной бюджет на 30
дней
вводные данные:
13509 81529
выходные данные:
450.3 2717.633333333333
 */
public class homeWork08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double budgetForDay = n / 30;

        System.out.println(budgetForDay);

    }
}
