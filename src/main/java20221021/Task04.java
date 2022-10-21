package main.java20221021;

import java.util.Scanner;

/*

Задача 4
Даны два целых числа a и b. Проверить утверждение, что хотя бы одно из них
нечетное.
Вход Выход
63 65 true
62 75 true
2 4 false

 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + " " + b);

        boolean aIsOdd = a % 2 == 1;
        boolean bIsOdd = a % 2 == 0;

        System.out.println(aIsOdd || bIsOdd);
        //Используем тернарный оператор
//        boolean isAnybodyOdd = (bIsOdd || aIsOdd) ? true : false;
    }
}
