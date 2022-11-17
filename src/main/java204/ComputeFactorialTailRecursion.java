package main.java204;

import java.util.Scanner;

/*
Нехвостовая рекурсия часто может быть преобразована в хвостовую с помощью дополнительных параметров. Эти параметры
используются для того, чтобы содержать результат. Идея заключается в том, чтобы встроить ожидающие операции во
вспомогательные параметры таким образом, чтобы у рекурсивного вызова не было ожидающей операции. Можно определить
новый рекурсивный метод с дополнительными параметрами. Этот метод может перегрузить исходный метод с тем же именем,
но другой сигнатурой. Например, рекурсивный метод factorial() из программы ComputeFactorial переписан в программе
ComputeFactorialTailRecursion как метод с хвостовой рекурсией.
 */
public class ComputeFactorialTailRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите неотрицательное целое число: ");
        int n = input.nextInt();

        // Отобразить n!
        System.out.println(n + "! равно " + factorial(n));
    }

    /**
     * Возвращает n!
     */
    public static long factorial(int n) {
        return factorial(n, 1); // вызывает вспомогательный метод
    }

    /**
     * Вспомогательный метод с хвостовой рекурсией для n!
     */
    private static long factorial(int n, int result) {
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result); // рекурсивный вызов
    }
}
