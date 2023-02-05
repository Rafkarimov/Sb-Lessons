package main.home044;
/*
Все задачи этого блока необходимо решить, используя стримы:
Посчитать сумму четных чисел в промежутке от 1 до 100 включительно и вывести ее на
экран.
 */

import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int result = IntStream.rangeClosed(1, 100)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.println(result);
    }
}
