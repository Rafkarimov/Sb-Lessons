package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который получает в качестве параметра два числа
(А и В) и выводит на экран все четные числа из диапазона А... В.
 */
public class Method09 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        count(num1, num2);

    }
//вариант с методом, с войд, как сделать без войд - вопрос.
    public static void count(int x, int y) {
        int i;
        for (i = x; i < y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
//вариант без метода
//        for (int i = num1; i < num2; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }