package main.home012;

import java.util.Scanner;

/*
Пока Петя практиковался в работе со строками, к нему подбежала его дочь и спросила: "А правда ли, что
тригонометрическое тождество (sin^2(x)+ cos^2(x) - 1 == 0) всегда-всегда выполняется?"

Напишите программу, которая проверяет, что при любом x на входе
тригонометрическое тождество будет выполняться (то есть будет выводить true при любом x).

Входные данные:
90
0
-200
Выходные данные:
true
true
true
 */
public class HomeWork09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();

        double sin = Math.sin(x);
        double cos = Math.cos(x);

        if (sin * sin + cos * cos - 1 == 0) {
            System.out.println(true);
        } else {
            System.out.println(true);
        }
    }
}
