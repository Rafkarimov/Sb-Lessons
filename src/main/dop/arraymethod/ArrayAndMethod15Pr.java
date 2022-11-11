package main.dop.arraymethod;

import java.util.Scanner;

/*
Напишите метод, который получает в качестве параметра массив и дополнительный параметр S. Метод сначала заполняет
четные ячейки массива двузначными положительными случайными числами. Затем нечетные ячейки метод заполняет так,
чтобы сумма значений в нечетной ячейке и в предшествующей ей четной ячейке была равна S. Каким условиям
должен отвечать параметр S для того, чтобы задача имела решение?
 */
public class ArrayAndMethod15Pr {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int down = 10;
        int up = 99;
        int[] m = new int[n];
        fill(m, down, up, s);
        write(m);
    }

    private static void write(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }

    private static void fill(int[] m, int down, int up, int s) {
        for (int i = 0; i < m.length; i += 2) {
            m[i] = down + (int) ((up - down + 1) * Math.random());
        }
        for (int i = 1; i < m.length; i += 2) {
            m[i] = s - m[i - 1];
        }
    }
}
