package main.home011;

import java.util.Scanner;

/*
На вход подается двузначное число n. Выведите число, полученное
перестановкой цифр в исходном числе n. Если после перестановки получается
ведущий 0, его также надо вывести.
Вводные данные:
45 10
Выцходные данные:
54 01

a = 10 % 10 = 0
b = 10 / 10 = 1


 */
public class HomeWork07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n % 10;
        int b = n / 10;

        System.out.println(String.format("%02d", a*10+b));
    }
}
