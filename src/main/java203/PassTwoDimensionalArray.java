package main.java203;

import java.util.Scanner;

/*
Двумерный массив можно передать методу и вернуть из метода точно так же, как одномерный массив. В программе
PassTwoDimensionalArray представлены два метода. Первый метод getArray() возвращает двумерный массив, а второй метод
sum(int[][] m) возвращает сумму всех элементов в матрице.
 */
public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray();

        System.out.println("\nСумма элементов равна " + sum(m));
    }

    /**
     * Получает значения элементов
     */
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("Введите " + m.length + " строчек и "
                + m[0].length + " столбцов через пробел: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();

        return m;
    }

    /**
     * Вычисляет сумму элементов
     */
    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                total += m[row][column];
            }
        }

        return total;
    }
}
