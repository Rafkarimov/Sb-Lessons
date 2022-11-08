package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметров два параметра линейной функции (а и Ь, для уравнения у=ах+b),
а также координаты точки на плоскости (х и у). Метод возвращает значение true,
если точка лежит на графике функции; в ином случае метод возвращает значение false
 */
public class Method24Les {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        boolean flag;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        flag = what(a, b, x, y);
        System.out.println(flag);
    }

    public static boolean what(int a, int b, int x, int y) {
        int t = a * x + b;
        if (t == y) {
            return true;
        } else {
            return false;
        }
    }
}
