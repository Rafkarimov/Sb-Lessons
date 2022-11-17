package main.java204;
/*
Программа ComputeFibonacci предлагает пользователю ввести индекс и находит число Фибоначчи для этого индекса.
 */
import java.util.Scanner;

public class ComputeFibonacci {
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
