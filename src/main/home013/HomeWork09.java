package main.home013;

import java.util.Scanner;

/*
На вход последовательно подается возрастающая последовательность из n
целых чисел, которая может начинаться с отрицательного числа.
Посчитать и вывести на экран, какое количество отрицательных чисел было
введено в начале последовательности. Помимо этого нужно прекратить
выполнение цикла при получении первого неотрицательного числа на вход.
Входные данные:
-55 -42 -19 -15 17 33
10 20

Выходные данные:
4
0

 */
public class HomeWork09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split("\\s");
        int count = 0;

        for (String s : array) {
            int num = Integer.parseInt(s);
            if (num < 0) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
