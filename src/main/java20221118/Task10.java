package main.java20221118;

import java.util.Scanner;

/*
На вход подается строка.
    Развернуть строку рекурсивно.

    Вход
    abcdef

    Выход
    fedcba

 */
public class Task10 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverseString(s));
    }

    private static String reverseString(String input) {
        System.out.println("Вызов функции ReverseString " + input);
        if (input.isEmpty()) {// является ли строка пустой
            System.out.println("Строка пустая, возвращаю " + input);
            //базовый случай
            return input;
        }
        System.out.println("Моя буква "+ input.charAt(0));
        System.out.println("Передаю подстроку "+ input.substring(1));
        return  reverseString(input.substring(1)) + input.charAt(0);
    }
}
//return (reverseString() + (reverseString() + (reverseString() + (reverseString() + s.sharAt(0) ))))
