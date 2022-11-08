package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который получает в качестве параметра целое число
большее или равное 10. Метод возвращает число без его крайней левой
цифры.
Например, для параметра 1234 метод вернет 234, а для параметра
104 -4.

 */
public class Method12Les {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
        x = in.nextInt();
        y = what(x);
        System.out.println(y);
    }

    public static int what(int t) {
        int a = t;
        int count = 0;
        while (a > 0) {
            count++;
            a /= 10;
        }
        int b = (int) Math.pow(10, count - 1);
        return t % b;
    }
}
