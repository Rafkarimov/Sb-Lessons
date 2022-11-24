package main.java301;

import java.util.Scanner;

/*
Создайте класс с именем Location для нахождения наибольшего элемента и его позиции в двумерном массиве.
Класс должен содержать public-поля row, column и maxValue, в которых будут храниться наибольший элемент типа double
и его индексы в двумерном массиве со строчками и столбцами типа int.

Напишите следующий метод, который возвращает позицию наибольшего элемента в двумерном массиве:

public static Location locateLargest(double[][] a)
Возвращаемое значение должно быть типа Location. Напишите клиент этого класса — программу, которая предлагает
пользователю ввести двумерный массив и отображает позицию наибольшего элемента в этом массиве. Пример выполнения
программы:

Введите количество строчек и столбцов массива: 3 4
Введите массив:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
Наибольший элемент массива, равный 45.0, находится в позиции (1, 2)
 */
public class TestLocation {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите количество строчек и столбцов");
        int numberOfRows = sc.nextInt();
        int numberOfColumns = sc.nextInt();

        double[][] a = new double[numberOfRows][numberOfColumns];

        System.out.println("Введите массив: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextDouble();

                Location location = locateLargest(a);
                System.out.println("Наибольший элемент массива, равный "
                        + location.maxValue + ", находится в позиции("
                        + location.row + ", " + location.column + ")");
            }
        }
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (location.maxValue < a[i][j]) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}

class Location {
    public int row, column;
    double maxValue;
}
