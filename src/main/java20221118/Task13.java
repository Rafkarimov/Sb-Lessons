package main.java20221118;

import java.util.Scanner;

/*
    На вход подается два целых числа a и b
    Написать функцию через рекурсию для
    вычисления суммы заданных положительных
    целых чисел a b без прямого использования
    оператора + между ними.

 */
public class Task13 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();

        System.out.println(sum(n,m));
    }

    private static int sum(int a, int b) {
        if (b == 0){
            return a;
        }
        return sum(++a,--b); // a+1, b-1
    }
}
