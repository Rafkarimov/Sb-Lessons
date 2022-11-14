package main.home021;

import java.util.Scanner;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
вещественных чисел (ai) из N элементов.
Необходимо реализовать метод, который принимает на вход полученный
массив и возвращает среднее арифметическое всех чисел массива.
Вывести среднее арифметическое на экран.
Ограничения:
● 0 < N < 100
● 0 < ai < 1000

Входные данные
3
1,5 2,7 3,14

2
30.42 12

Выходные данные
2.4466666666666668

21.21

 */
public class HomeWork01 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.println(findAverage(arr));
    }

    //1,5 2,7 3,14
    private static double findAverage(double[] arr) {
        double sum = 0;
        for (double v : arr) { // for (int i : arr) for(double i=0; i< arr.length; i++)
            sum += v; // прибавляем все числа в массиве
        }
        return sum / arr.length;
//        System.out.println(sum / arr.length);
    }

}
