package main.dop.method;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметров целое
число и возвращает сумму его цифр.
Входные:
451
976
Выходные:
10
22
 */
public class Method10 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int num = in.nextInt();
        what(num);
    }

    public static void what(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
    }
}

//        int sum = 0;
//        while (num > 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println(sum);
//    }