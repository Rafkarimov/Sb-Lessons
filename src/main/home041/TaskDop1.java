package main.home041;

import java.util.Arrays;
import java.util.Scanner;

/*
1. На вход подается число n и массив целых чисел длины n.
Вывести два максимальных числа в этой последовательности.
Пояснение: Вторым максимальным числом считается тот, который окажется
максимальным после вычеркивания первого максимума.
Входные данные:
5
1 3 5 4 5

3
3 2 1

Выходные данные:
5 5
3 2
 */
public class TaskDop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length - 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
