package main.stream.streams;

import java.util.stream.Stream;

public class AppFilter {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        stream.filter((Integer digit) -> { // принимает Predicat, первый фильтр
                    if (digit > 2) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .filter((Integer digit) -> { // второй фильтр, который работает после первого фильтра, промежуточные
                    // операции такие как фильтр можно использовать не один раз, терминальные только один в конце
                    if (digit >= 4) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .forEach(System.out::println);
    }
}
