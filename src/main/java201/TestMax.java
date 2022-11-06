package main.java201;

public class TestMax {
    /**
     * Метод main
     */
    public static void main(String[] args) {
        int i, j, k;
        i = 5;
        j = 2;
        k = max(i, j); // вызов метода max
        System.out.println("Наибольшее из " + i +
                " и " + j + " равно " + k);
    }

    /**
     * Возвращает наибольшее из двух чисел
     */
    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result; // возврат result
    }
}
