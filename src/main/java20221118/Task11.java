package main.java20221118;

import java.util.Scanner;

/*
Реализовать алгоритм Евклида рекурсивно.
    Алгоритм Евклида находит наибольший общий делитель двух чисел.
    Формула НОД: НОД (a, b) = НОД (b, с),
    где с — остаток от деления a на b


    Алгоритм Евклида заключается в следующем:
    если большее из двух чисел делится на меньшее —
    наименьшее число и будет их наибольшим общим делителем.

 */
public class Task11 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n, m));
    }

    //Формула НОД: НОД (a, b) = НОД (b, с),
    private static int gcd(int a, int b) {
        if (b == 0) { // базовый случай
            return a;
        }
        return gcd(b, a % b);
    }

}
