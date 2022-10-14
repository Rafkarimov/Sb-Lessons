package main.java20221014;

import java.util.Scanner;

public class Task9 {
    /*
    Даны целые числа a, b и с, определяющие квадратное уравнение. Вычислить дискриминант этого квадратного уравнения.
        Подсказка: D = b^2 - 4 * a * c

        Входные данные
        a = 6 b = -28 с = 79
        Выходные данные
        -1112

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные a: ");
        int a = scanner.nextInt();

        System.out.println("Введите данные b: ");
        int b = scanner.nextInt();

        System.out.println("Введите данные c: ");
        int c = scanner.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Дискримининант: " + d);


    }
}
