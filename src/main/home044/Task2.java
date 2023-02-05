package main.home044;
/*
Все задачи этого блока необходимо решить, используя стримы:
На вход подается список целых чисел. Необходимо вывести результат перемножения
этих чисел.
Например, если на вход передали List.of(1, 2, 3, 4, 5), то результатом должно быть число
120 (т.к. 1 * 2 * 3 * 4 * 5 = 120).
 */

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(multiplyList(List.of(1, 2, 3, 4, 5)));
    }

    private static int multiplyList(List<Integer> input) {
        return input.stream()
                .reduce(1, (a, b) -> a * b); // изучить!
    }
}
