package main.home012;

import java.util.Scanner;

/*
5.	(1 балл) Дома дочери Пети опять нужна помощь с математикой! В этот раз ей нужно проверить, имеет
ли предложенное квадратное уравнение решение или нет.

На вход подаются три числа — коэффициенты квадратного уравнения a, b, c. Нужно вывести "Решение есть",
если оно есть и "Решения нет", если нет.
a*x2 +b*x + c = 0, a!=0;

Входные данные:
1 -95 18
46 44 3
34 35 39
31 -89 4
Выходные данные:
Решение есть
Решение есть
Решения нет
Решение есть
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d;

        d = b * b - 4 * a * c;

        if (d >= 0) {
            System.out.println("Решение есть");
        } else {
            System.out.println("Решения нет");
        }

    }
}
