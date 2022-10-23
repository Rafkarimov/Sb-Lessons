package main.home012;

import java.util.Scanner;

/*
3.	(1 балл) Петя снова пошел на работу. С сегодняшнего дня он решил ходить на обед строго после полудня. Периодически
он посматривает на часы (x - час, который он увидел). Помогите Пете решить, пора ли ему на обед или нет.
Если время больше полудня, то вывести "Пора". Иначе - “Рано”.
Входные данные:
7
13
12
22
Выходные данные:
Рано
Пора
Рано
Пора
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 12) {
            System.out.println("Пора");
        } else {
            System.out.println("Рано");
        }
    }
}
