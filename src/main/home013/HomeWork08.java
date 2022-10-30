package main.home013;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

/*
На вход подается:
○ целое число n,
○ целое число p
○ целые числа a1, a2 , … an
Необходимо вычислить сумму всех чисел a1, a2, a3 … an которые строго
больше p
Входные данные:
2
18
95 31

6
29
40 37 97 72 80 18

1
100
42

Выходные данные:
126
326
0
 */
public class HomeWork08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String p = scanner.nextLine();
        String str = scanner.nextLine();
        String[] array = str.split("\\s");
        int sum = 0;

        for (String s : array) {
            int num = Integer.parseInt(s);
            if (num > Integer.parseInt(p)) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
