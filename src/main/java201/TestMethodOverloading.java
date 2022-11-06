package main.java201;

public class TestMethodOverloading {
    /**
     * Метод main
     */
    public static void main(String[] args) {
        // Вызвать метод max с параметрами типа int
        System.out.println("Наибольшее из 3 и 4 равно "
                + max(3, 4));

        // Вызвать метод max с параметрами типа double
        System.out.println("Наибольшее 3.0 и 5.4 равно "
                + max(3.0, 5.4));

        // Вызвать метод max с тремя параметрами типа double
        System.out.println("Наибольшее of 3.0, 5.4 и 10.14 равно "
                + max(3.0, 5.4, 10.14));
    }

    /**
     * Возвращает наибольшее из двух чисел типа int
     */
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /**
     * Возвращает наибольшее из двух чисел типа double
     */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /**
     * Возвращает наибольшее из трех чисел типа double
     */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
