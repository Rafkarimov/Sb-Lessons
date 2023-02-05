package main.java20230128.stream.task2;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//посчитать n! (факториал) с помощью стримов
public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(IntStream.rangeClosed(1, 1_000_000) // просто range не включает значение от 1, 10 - 10 не входит
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ZERO, BigInteger::multiply));
        System.out.println(System.nanoTime() - startTime);
        startTime = System.nanoTime();
        List<BigInteger> list = IntStream.rangeClosed(1, 1_000_000)
                .mapToObj(BigInteger::valueOf)
                .collect(Collectors.toList());

        System.out.println(list.parallelStream()
                .reduce(BigInteger.ZERO, BigInteger::multiply, BigInteger::add));
        System.out.println(System.nanoTime() - startTime);
    }
}
