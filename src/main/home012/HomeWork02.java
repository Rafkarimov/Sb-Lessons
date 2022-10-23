package main.home012;

import java.util.Scanner;

/*
2.	(1 балл) Петя пришел домой и помогает дочке решать математику. Ей нужно определить, принадлежит ли точка
с указанными координатами первому квадранту. Недолго думая, Петя решил автоматизировать процесс и написать программу:
на вход нужно принимать два целых числа (координаты точки), выводить true, когда точка попала в квадрант и false иначе.
Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её координаты удовлетворяют условию:
x > 0 и y > 0.
Входные данные:
-50 -12
42 15
0 23
46 26
Выходные данные:
false
true
false
true
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
