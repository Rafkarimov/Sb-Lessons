package main.java106;
/*
Напишите программу, которая запрашивает у пользователя числовые значения, а выводит количество положительных и
количество отрицательных введенных значений.

Подсказка: в качестве значения сигнальной метки используйте 0.
 */

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int plus = 0;
        int minus = 0;
        int num;
        var in = new Scanner(System.in);
        System.out.println("Введите число: ");
        
        do {
            System.out.println("Введите число: ");
            num = in.nextInt();
            if (num > 0) {
                plus++;
            } else if (num < 0) {
                minus++;
            }
            if (num == 0)
                break;
            System.out.println("количество положительных чисел равно: " + plus);
            System.out.println("количество отрицательных чисел равно: " + minus);
            System.out.println();
            System.out.println("Введите число: ");
        } while (in.hasNextInt());


//        for (; in.hasNextInt() ;) {
//            num = in.nextInt();
//            if (num > 0) {
//                plus++;
//            } else if (num < 0) {
//                minus++;
//            }
//            if (num == 0)
//                break;
//            System.out.println("количество положительных чисел равно: " + plus);
//            System.out.println("количество отрицательных чисел равно: " + minus);
//            System.out.println();
//            System.out.println("Введите число: ");
//        }

//        while (in.hasNextInt()) {
//            num = in.nextInt();
//            if (num > 0) {
//                plus++;
//            } else if (num < 0) {
//                minus++;
//            }
//            if (num == 0)
//                break;
//            System.out.println("количество положительных чисел равно: " + plus);
//            System.out.println("количество отрицательных чисел равно: " + minus);
//            System.out.println();
//            System.out.println("Введите число: ");
//        }
        System.out.println("Расчет окончен." + "\nИтого" + "\nположительных:" + plus + "\nотрицательных: " + minus);
    }
}
