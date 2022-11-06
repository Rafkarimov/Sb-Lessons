package main.java201;

public class TestPassByValue {
    /**
     * Метод main
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("До вызова метода swap() num1 равно " +
                num1 + " и num2 равно " + num2);

        // Вызвать метод swap для замены значений двух переменных
        swap(num1, num2);

        System.out.println("После вызова метода swap() num1 равно " +
                num1 + " и num2 равно " + num2);
    }

    /**
     * Переставляет значения двух переменных
     */
    public static void swap(int n1, int n2) {
        System.out.println("  Внутри метода swap()");
        System.out.println("    До замены, n1 равно " + n1
                + " и n2 равно " + n2);

        // Переставить n1 и n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("    После замены, n1 равно " + n1
                + " и n2 равно " + n2);
    }
}
