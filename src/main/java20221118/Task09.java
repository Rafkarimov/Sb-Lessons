package main.java20221118;

import java.util.Scanner;

/*
На вход подается натуральное число N.
    Необходимо проверить, является ли оно
    степенью двойки (решить через рекурсию).
    Вывести true, если является и false иначе.

    Вход
    4
    Выход
    true

    Вход
    5
    Выход
    false

 */
public class Task09 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(checkPowerOfTwo(n));
    }

    private static boolean checkPowerOfTwo(int n) {
        if (n == 2 || n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return checkPowerOfTwo(n / 2);
    }
}
