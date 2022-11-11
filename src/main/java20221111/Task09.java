package main.java20221111;

import java.util.Arrays;
import java.util.Scanner;

/*
На вход подается число N — количество пар чисел,
    переданных далее (описание элементов массива).
    Далее N строк состоящих из двух чисел:
    количества элементов и сам элемент.
    Вывести массив, соответствующий данному описанию.

    Входные данные  Выходные данные
    3               7 7 1 1 1 1 6
    2 7
    4 1
    1 6
    count = [2, 4, 1]
     и elem = [7, 1 , 6]

 */
public class Task09 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] count = new int[n];
        int[] elem = new int[n];

        int size = 0;
        for (int i = 0; i < n; i++) {
            count[i] = sc.nextInt();
            size += count[i];
            elem[i] = sc.nextInt();
        }

        int[] res = new int[size];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count[i]; j++) {
                res[k++] = elem[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
