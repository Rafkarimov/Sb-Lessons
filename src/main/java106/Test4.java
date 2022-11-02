package main.java106;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователю строку и отображает ее в обратном порядке. Пример запуска:

Введите строку: ABCD
Обратная строка равна DCBA
 */
public class Test4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        for (int i=str.length()-1;i>=0;i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }

}
