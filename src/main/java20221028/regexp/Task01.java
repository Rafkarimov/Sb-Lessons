package main.java20221028.regexp;

import java.util.Scanner;

/*
   Проверить цвет в hex
    Проверить, является ли введенная строка корректным hex номером цвета.
    Корректная строка состоит из 7 символов, первый символ “#”, далее цифры или буквы от A до F (заглавные или прописные)
    Если строка является корректным hex номером цвета, то вывести true, иначе false.

    Вход        Выход
    #00AA12     true
    00FFFF      false
    #00FA       false

 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();

        System.out.println(color.matches("#[0-9A-Za-z]{6}"));
    }
}
