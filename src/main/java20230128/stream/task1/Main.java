package main.java20230128.stream.task1;

import main.java20230128.inner.task2.IntSquare;

import java.util.Arrays;
import java.util.List;

//Использовать реализованный функциональный интерфейс Square на массиве чисел, вывести на экран:
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        IntSquare intSquare = x -> x * x;
        list.stream()
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
