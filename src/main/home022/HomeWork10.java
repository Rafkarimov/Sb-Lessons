package main.home022;

import java.util.Scanner;

/*
10.	На вход подается число N. Необходимо вывести цифры числа справа налево. Решить задачу нужно через рекурсию.
Ограничения:
0 < N < 1000000

Входные данные
12374

201

Выходные данные
4 7 3 2 1

1 0 2

 */
public class HomeWork10 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseStringWithSpace(str));
    }

    private static String reverseString(String str) {
        if (str.isEmpty()) { // простой случай
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    private static String reverseStringWithSpace (String str) {
        return reverseString(str.replace("", " ").trim());
    }
}