package main.java106;

import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        int n, i, product;

        Scanner input = new Scanner(System.in);

        // Получить n
        System.out.print("Введите целое число: ");
        n = input.nextInt();

        // Вычислить n!
        product = 1;
        for (i = n; i > 1; --i)
            product *= i;

        // Отобразить n!
        System.out.println(n + "! равно " + product);
    }
}
