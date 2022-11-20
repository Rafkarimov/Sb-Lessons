package main.home022;

import java.util.Scanner;

/*
На вход подается число N. Необходимо вывести цифры числа слева направо. Решить задачу нужно через рекурсию.
Ограничения:
0 < N < 1000000

Входные данные
12374

201

Выходные данные
1 2 3 7 4

2 0 1

 */
public class HomeWork09 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(stringWithSpace(str));
    }

    private static String stringWithSpace(String str) {
        if (str.isEmpty()) { // простой случай
            return str;
        }
        return str.charAt(0) + " " + stringWithSpace(str.substring(1));
    }
}
