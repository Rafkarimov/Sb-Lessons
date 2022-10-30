package main.home013;

import java.util.Scanner;

/*
Дано натуральное число n. Вывести его цифры в “столбик”.
Входные данные:
74
1630
Выходные данные:
7
4

1
6
3
0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();


        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            System.out.println(c);
        }
    }
}
