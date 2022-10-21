package main.java20221021;

import java.util.Scanner;
/*
Задача 7
Реализовать System.out.println(), используя System.out.print() и символ переноса строки
\n.Вход Выход
Hello World Hello
World
 */
public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String  second = scanner.next();

        System.out.println(first + "\n");
        System.out.println(second + "\n");
    }
}
