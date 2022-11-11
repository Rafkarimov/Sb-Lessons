package main.java20221111;

import java.util.Scanner;

/*
На вход подается число N — длина массива.
    Затем передается массив целых чисел из N элементов.
    Затем передается элемент, который надо "удалить".

    Вывести массив без этого элемента.

    Вход                    Выход
    8
    10 2 38 75 9 38 123 2   10 38 75 9 38 123
    2

 */
public class Task08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] res = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != m) {
                res[j] = arr[i];
                j++;
            }
        }
        for (int elem : res) {
            System.out.print(elem);
        }
    }
}
