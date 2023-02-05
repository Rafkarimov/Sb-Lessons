package main.java20230128.stream.task3;

import java.util.stream.IntStream;

/*
Посчитать сумму квадратов первых десяти натуральных чисел делящихся на 5, но не на 2.
В процессе вывести отобранные числа на экран.
 */
public class Main {
    public static void main(String[] args) {
        int sum = IntStream.iterate(1, n -> n + 1) // метод iterate с 1
                .filter(i -> i % 5 == 0 && i % 2 != 0)
                .limit(10)
                .peek(System.out::println) // выводим на экран не форич так как нужна не тернальная функция
                .map(i -> i * i) //
                .sum();
        System.out.println(sum);
    }
}
