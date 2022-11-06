package main.java202;

public class TestPassArray {
    /**
     * Метод main
     */
    public static void main(String[] args) {
        int[] a = {1, 2};

        // Переставить элементы с помощью метода swap
        System.out.println("До вызова swap");
        System.out.println("массив равен {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("После вызова swap");
        System.out.println("массив равен {" + a[0] + ", " + a[1] + "}");

        // Переставить элементы с помощью метода swapFirstTwoInArray
        System.out.println("До вызова swapFirstTwoInArray");
        System.out.println("массив равен {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("После вызова swapFirstTwoInArray");
        System.out.println("массив равен {" + a[0] + ", " + a[1] + "}");
    }

    /**
     * Переставляет две переменные
     */
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    /**
     * Переставляет первые два элемента массива
     */
    public static void swapFirstTwoInArray(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
