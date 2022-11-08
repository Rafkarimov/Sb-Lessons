package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметра целое положительное число n и выводит на экран значения
факториалов всех чисел меньших n.
 */
public class Method28Les {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                what(i);
            }
        }
    }

    public static void what(int k) {
        int res = 1;
        for (int j = 1; j < k; j++) {
            res *= j;
            System.out.println(k + "!=" + res);
        }
    }
}
