package main.dop.array;

import java.util.Scanner;

/*
Напишите класс, который заполняет случайными двузначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом:
• в первой строке - значения из четных ячеек массива;
• во второй строке - значения из нечетных ячеек массива.
 */
public class Array15Pr {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int down = 10;
        int up = 99;
        int[] m = new int[n];
        fill(m, down, up);
        write(m);
    }

    private static void write(int[] m) {
        for (int i = 0; i < m.length; i += 2) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < m.length; i += 2) {
            System.out.print(m[i] + " ");
        }
    }

    private static void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = down + (int) ((up - down + 1) * Math.random()); // непонятно
        }
    }
}
