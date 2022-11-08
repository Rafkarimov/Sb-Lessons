package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметра целое
число и выводит на экран в одну строку через пробел все делители
этого числа (не считая 1 и самого числа). В случае если у числа нет ни
одного делителя - на экран выводится соответствующее текстовое
сообщение.
 */
public class Method20Les {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x,y;
        x = in.nextInt();
        what(x);
    }
    public static void what (int t) {
        int count = 0;
        for (int i = 2; i <= t/2; i++) {
            if (t%i==0) {
                System.out.println(i + " ");
                count++;
            }
            if (count==0)
                System.out.println("Нет");

        }
    }
}
