package main.java20221111;
/*
На вход подается число N — длина массива.
    Затем передается массив строк длины N.
    После этого число M.
    Сохранить в другом массиве только те элементы,
    длина строки которых не превышает M.

    Вход        Выход
    5           good to see you
    Hello
    good
    to
    see
    you
    4

    3           My friend
    My
    wonderful
    friend
    7

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int m = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].length() <= m) {
                count++;
            }
        }
        String[] res = new String[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].length() <= m) {
                res[j] = arr[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
