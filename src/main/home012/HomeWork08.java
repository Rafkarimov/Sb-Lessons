package main.home012;

import java.util.Scanner;

/*
(1 балл) Раз так легко получается разделять по первому пробелу, Петя решил немного изменить предыдущую
программу и теперь разделять строку по последнему пробелу.
Входные данные:
Hi great team!
Hello world!
Выходные данные:
Hi great
team!

Hello
world!

 */
public class HomeWork08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int value = str.lastIndexOf(' ');
        System.out.println(str.substring(0, value));
        System.out.println(str.substring(value + 1));
    }
}
