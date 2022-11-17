package main.java204;
/*
Перепишите программу ComputeFibonacci таким образом, чтобы в методе fib() вместо рекурсии использовалась итерация.

Подсказка: Для вычисления fib(n) без помощи рекурсии необходимо сначала вычислить fib(n - 2) и fib(n - 1).
Пусть f0 и f1 обозначают два предыдущих числа Фибоначчи. Текущее число Фибоначчи (currentFib) тогда будет равно
f0 + f1. Алгоритм можно написать следующим образом:

f0 = 0; // Для fib(0)
f1 = 1; // Для fib(1)
for (int i = 2; i <= n; i++) {
  currentFib = f0 + f1;
  f0 = f1;
  f1 = currentFib;
}
// После выхода из цикла, currentFib равно fib(n)
 */
import java.util.Scanner;

public class ComputeFibonacciIt {
    /**
     * Метод main
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Получить индекс числа Фибоначчи
        System.out.print("Введите индекс числа Фибоначчи: ");
        int index = input.nextInt();

        // Найти и отобразить число Фибоначчи
        System.out.println("Число Фибоначчи с индексом "
                + index + " равно " + fib(index));
    }

    /**
     * Находит число Фибоначчи
     */
    public static long fib(long index) {
        if (index == 0) // простой случай
            return 0;
        else if (index == 1) // простой случай
            return 1;
        else  // упрощение и рекурсивные вызовы
            return fib(index - 1) + fib(index - 2);
    }
}
