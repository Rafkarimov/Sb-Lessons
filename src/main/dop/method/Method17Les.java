package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметра целое число и возвращает самую большую цифру в этом числе.
5501317

7
 */
public class Method17Les {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
        x = in.nextInt();
        y = what(x);
        System.out.println(y);
    }

    public static int what(int t) {
        int max = t % 10;
        while (t > 0) {
            t /= 10;
            if (t % 10 > max)
                max = t % 10;
        }
        return max;
    }

}
