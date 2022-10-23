package main.home012;

import java.util.Scanner;

/*
11.	(1 балл) Разобравшись со своими (и не только) задачками, Петя уже собирался лечь спать и отдохнуть перед очередным
тяжелым рабочим днем, но вдруг в тишине раздается детский шепот: "Паааапааа, мы забыли решить ещё одну задачку!
Давай проверим, можно ли из трех сторон составить треугольник?". Что ж, придется написать еще одну программу, связанную
со школьной математикой.

На вход подается три целых положительных числа – длины сторон треугольника. Нужно вывести true, если можно составить
треугольник из этих сторон и false иначе.

Входные данные:
3 2 1
3 4 5
2 15 15
10 2 7
Выходные данные:
false
true
true
false
 */
public class HomeWork11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b > c && c + b > a && c + a > b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
