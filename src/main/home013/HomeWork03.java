package main.home013;

import java.util.Scanner;

/*
На вход подается два положительных числа m и n. Необходимо вычислить m^1
+ m^2 + ... + m^n
Входные данные:
1 1
8 5
Выходные данные:
1
37448
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(m,i);
        }
        System.out.println(sum);


//        for (double i = 0; i <= Math.pow(m, n); i = Math.pow(m, j++)) {
//            sum += i;
//            System.out.println(sum);
//        }

    }
}
