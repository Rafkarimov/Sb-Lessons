package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметров целое
число Х и цифру D. Метод возвращает значение true, если цифра D
встречается хотя бы раз в числе Х; в ином случае метод возвращает
значение false.
 */
public class Method32Les {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = sc.nextInt();
        boolean flag;
        flag = what(x, d);
        System.out.println(flag);
    }

    public static boolean what(int x, int d) {
        boolean flag = false;
        while (x > 0 && flag == false) {
            flag = (x % 10 == d);
            x /= 10;
        }
        return flag;
    }
}
