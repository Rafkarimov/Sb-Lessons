package main.home031.trianglechecker;
/*
7.	Реализовать класс TriangleChecker, статический метод которого принимает три длины сторон треугольника и возвращает
true, если возможно составить из них треугольник, иначе false. Входные длины сторон треугольника — числа типа double.
Придумать и написать в методе main несколько тестов для проверки работоспособности класса (минимум один тест на
результат true и один на результат false)
 */

public class MainTriangleChecker {
    public static void main(String[] args) {
        System.out.println(TriangleChecker.checkingTriangle(1,1,1)); // true
        System.out.println(TriangleChecker.checkingTriangle(10,2,3)); // false
    }
}
