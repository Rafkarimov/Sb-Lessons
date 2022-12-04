package main.home031.trianglechecker;

/*
7.	Реализовать класс TriangleChecker, статический метод которого принимает три длины сторон треугольника и возвращает
true, если возможно составить из них треугольник, иначе false. Входные длины сторон треугольника — числа типа double.
Придумать и написать в методе main несколько тестов для проверки работоспособности класса (минимум один тест на
результат true и один на результат false)
 */
public class TriangleChecker {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public static boolean checkingTriangle(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        return a < bc && b < ac && c < ab;
    }
}
