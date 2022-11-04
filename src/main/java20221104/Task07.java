package main.java20221104;

import java.util.Scanner;

/*
  На вход подается число n и последовательность целых чисел длины n.
    Вывести два максимальных числа в этой последовательности без использования массивов.

    Входные данные
    10
    8 79 61 94 59 4 34 6 77 10

    Выходные данные
    94 77

    Входные данные
    5
    3 38 8 38 12

    Выходные данные
    38 38

 */
public class Task07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        int max = Math.max(firstNum, secondNum);
        int secondMax = Math.min(firstNum, secondNum);

        for (int i = 3; i <= n; i++) {
            int k = sc.nextInt();
            if (k > max) {
                secondMax = max;
                max = k;
            } else if (k > secondMax) {
                secondMax = k;
            }
        }
        System.out.println(secondMax);
        System.out.println(max);
    }
}
