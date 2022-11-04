package main.java20221104;

import java.util.Scanner;

/*
    Дано число m < 13 и n < 7.  Вывести все степени (от 0 до n включительно) числа m с помощью цикла.
    Входные данные
    3 6
    Выходные данные
    1
    3
    9
    27
    81
    243
    729

    Входные данные
    12 3
    Выходные данные
    1
    12
    144
    1728

 */
public class Task03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();


        for (int i = 0; i <= n; i++) {


            System.out.println((int) Math.pow(m,i));
        }
    }
}
