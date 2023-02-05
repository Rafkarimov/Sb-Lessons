package main.java20230128.inner.task2;
/*
с помощью функционального интефейса выполнить подсчет квадрата числа:
 */
public class Main {
    public static void main(String[] args) {
        IntSquare intSquare = x -> x * x;
        System.out.println(intSquare.calculate(5));
    }
}
