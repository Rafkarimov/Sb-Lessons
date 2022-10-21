package main.java20221021;

import java.util.Locale;
import java.util.Scanner;

/*
Задача 9
На вход программе подается строка и подстрока в этой строке. Заменить символы
данной подстроки в строке на заглавные.
Вход Выход
Hello
o
HellO
Hello world
ld
Hello worLD
Hello
ll
HeLLo
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = scanner.next();
        String upperPattern = pattern.toUpperCase();

        System.out.println(str.replace(pattern, upperPattern));


    }
}
