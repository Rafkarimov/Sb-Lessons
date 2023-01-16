package main.home041;

import java.util.Scanner;

/*
2. На вход подается число n, массив целых чисел отсортированных по
возрастанию длины n и число p. Необходимо найти индекс элемента массива
равного p. Все числа в массиве уникальны. Если искомый элемент не найден,
вывести -1.
Решить задачу за логарифмическую сложность.
входные данные:
5
-42 -12 3 5 8
5

2
17 19
20
выходные данные:
3

-1
 */
public class TaskDop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] < p) {
                low = mid + 1;
            } else if (arr[mid] > p) {
                high = mid - 1;
            } else if (arr[mid] == p) {
                index = mid;
            }
        }
        System.out.println(index);
    }
}
