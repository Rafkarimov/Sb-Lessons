package main.dop.arraymethod;

import java.util.Scanner;

/*
Напишите метод, который получает в качестве параметра массив и
заполняет его положительными случайными двузначными числами, у
каждого из которых цифра десятков равна цифре единиц.
 */
public class ArrayAndMethod11Pr {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int down = 3;
        int up = 32;
        int[] m = new int[n];
        fill(m, down, up);
        write(m);
    }

    private static void write(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }

    private static void fill(int[] m, int down, int up) {
        for (int i = 0; i < m.length; i++) {
            m[i] = 3 * (down + (int) ((up - down + 1) * Math.random())) + 1;
        }
    }
}
