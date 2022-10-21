package main.java20221021;

import java.util.Scanner;

/*
Задача 8
На вход подается символ. Если символ в нижнем регистре - то вывести этот же символ
в верхнем. Если символ в верхнем регистре - то вывести этот же символ в нижнем.
Вход Выход
A a
B b
a A
b B
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        char c = symbol.charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println((char) (c - ('a' - 'A')));

        } else {
            System.out.println((char) (c + ('a' - 'A')));
        }
    }
}
