package main.home044;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Все задачи этого блока необходимо решить, используя стримы:
На вход подается список вещественных чисел. Необходимо отсортировать их по
убыванию.

 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(sortRealNumbersDescending(List.of(-1.0D, -0.5D, 0D, 1D, 5.0D, 10D)));
    }

    private static List<Double> sortRealNumbersDescending(List<Double> input) {
        return input.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
