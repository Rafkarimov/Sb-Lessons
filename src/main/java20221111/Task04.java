package main.java20221111;

import java.util.Arrays;
import java.util.Scanner;

/*
На вход подается два отсортированных массива.
    Нужно создать отсортированный третий, состоящий из элементов первых двух.

    Вход            Выход
    5               1 1 2 3 4 6 7
    1 2 3 4 7
    2
    1 6

    4               10 20 20 20 123 125 272 400
    20 20 123 273
    4
    10 20 125 400

 */
public class Task04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        mergeTwoArraysWithForLoop(array1, array2);
        mergeTwoArraysWithCopy(array1, array2);
        mergeTwoArrays(array1, array2);

    }

    /**
     * Сливает два отсортированных массива в один отсортированный
     *
     * @param array1 - первый отсортированный массива
     * @param array2 - второй отсортированный массив
     *               комментарий в документации делает над функцией
     */

    public static void mergeTwoArraysWithForLoop(int[] array1, int[] array2) {
        //Способ через цикл + сортировка
        int[] mergedArray = new int[array1.length + array2.length];
        int pos = 0;
        for (int elem : array1) {
            mergedArray[pos] = elem;
            pos++;
        }

        for (int elem : array2) {
            mergedArray[pos] = elem;
            pos++;
        }
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static void mergeTwoArraysWithCopy(int[] arr1, int[] arr2) {
        //Способ через цикл + сортировка
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
                //  mergedArray[k] = arr1[i]
                //k++;
                //i++;
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(mergedArray));


        //1 2 |3 4 7        j = 0  if arr[i] < arr[j]
        //1 6  |            j=0 j++

        //1 2 |3 4 7        j = 0  if arr[i] < arr[j] i++
        //1 6  |            j=1

        //1 2 |3 4 7        j = 1  if arr[i] < arr[j] i++
        //1 6  |            j=1

        //1 2 3 |4 7        j = 2  if arr[i] < arr[j] i++
        //1 6  |            j=1

        //1 2 3 4 |7        j = 3  if arr[i] < arr[j] i++
        //1 6  |            j=1

        //1 2 3 4 |7        j = 4  if arr[i] < arr[j] i++
        //1 6  |            j=1

        //1 2 3 4 |7        j = 4  if arr[i] < arr[j] i++
        //1 6  |            j=2

        // 1 1 2 3 4 6 7


    }
}

