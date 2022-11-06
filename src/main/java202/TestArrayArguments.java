package main.java202;

public class TestArrayArguments {
    public static void main(String[] args) {
        int x = 1; // x представляет значение типа int
        int[] y = new int[10]; // y представляет массив значений типа int

        m(x, y); // Вызывает метод m с аргументами x и y
        System.out.println("x равно " + x);
        System.out.println("y[0] равно " + y[0]);
    }

    public static void m(int number, int[] numbers) {
        number = 1001; // Присваивает новое значение переменной number
        numbers[0] = 5555; // Присваивает новое значение переменной numbers[0]
    }
}
