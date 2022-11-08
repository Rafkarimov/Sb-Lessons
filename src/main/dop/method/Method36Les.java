package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметра целое число и проверяет, каких цифр в нем больше -
четных или нечетных (позначению). В случае если больше четных - метод возвращает 1, если больше нечетных -
метод возвращает -1, в случае равенства количества четных и нечетных цифр - метод возвращает О.
1561651131

-1

 */
public class Method36Les {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = what(x);
        System.out.println(y);
    }

    public static int what(int temp) {
        int count1 = 0;
        int count2 = 0;
        int digit;
        while (temp > 0) {
            digit = temp % 10;
            if (digit % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
            temp /= 10;
        }
        if (count1 > count2) {
            return 1;
        }
        if (count1 < count2) {
            return -1;
        }
        return 0;
    }
}
