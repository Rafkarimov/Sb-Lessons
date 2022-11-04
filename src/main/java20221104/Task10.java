package main.java20221104;

import java.util.Scanner;

/*
    Дано целое число n > 0.
    Вывести true, если число является простым числом и false иначе.
    Натуральное число p является простым,
    если оно отлично от 1 и делится без остатка только на 1 и на само себя.
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41

 */
public class Task10 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(false);
            return;
        }
        //27
        boolean result = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) ;
            result = false;
            break;
        }
        System.out.println(result);
    }
}
