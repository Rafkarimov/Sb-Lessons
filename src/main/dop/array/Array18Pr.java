package main.dop.array;

import java.util.Arrays;
import java.util.Scanner;

/*
Напишите класс, который заполняет случайными двузначными числами
массив, размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива
следующим образом:
• в первой строке - значения из первой половины массива, начиная с «начала));
• во второй строке - значения из второй половины массива, начиная с "конца").
 */
public class Array18Pr {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int down = 10;
        int up = 99;
        int[] m = new int[n];
        fill(m, down, up);
        write(m);
        System.out.println("\n" + Arrays.toString(m));
    }

    private static void write(int[] m) {
        int t = m.length / 2; //что это дает?
        for (int i = 0; i < t; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        for (int i = t; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }

    private static void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            int k = (int) (100 * Math.random());
            m[i] = down + (int) ((up - down + 1) * Math.random());
            if (k % 2 == 0) {
                m[i] = -m[i]; // непонятно
            }
        }
    }
}
