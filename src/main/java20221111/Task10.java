package main.java20221111;

import java.util.Arrays;
import java.util.Scanner;

/*
На вход подается число N — длина массива.
    Затем передается массив целых чисел из N элементов.
    Проверить можно ли его разделить на 2
    (в нем должно быть каждого элемента по два).
    Если можно — вывести true, иначе — false.

    Вход                    Выход
    8                       true
    75 10 2 38 38 75 2 10

    5                       false
    2 82 12 2 14

 */
public class Task10 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        boolean result = true;
        int k = 1; // индекс массива arr
        //75 10 2 38 38 75 2
        // for (int i = 0; i < n - 1; i+=2)
        //            if (arr[i] != arr[i + 1]) res = false;
        while (k < n) {
            if (arr[k] != arr[k - 1]) {
                result = false;
                break;
            }
            k += 2;
        }
        System.out.println(result);
    }
}
