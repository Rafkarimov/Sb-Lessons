package main.dop.array;

import java.util.Scanner;

/*
Напишите класс, который заполняет случайными трехзначными числами массив, размер которого при инициализации вводится
с клавиатуры.
После заполнения класс должен вывести на экран значения массива в
одной строке, начиная с «начала» массива (с первой ячейки).
 */
public class Array12Pr {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int down = 100;
        int up = 999;
        int[] m = new int[n];
        fill(m, down, up);
        write(m);
    }

    private static void write(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i] + " ");
        }
    }

    private static void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = down + (int) ((up - down + 1) * Math.random());
        }
    }
}
