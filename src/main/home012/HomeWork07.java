package main.home012;
/*
7.	(1 балл) Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
Ему хочется уметь разделять строку по первому пробелу. Для этого он может воспользоваться
методами indexOf() и substring().

На вход подается строка. Нужно вывести две строки, полученные из входной разделением по первому пробелу.
Входные данные:
Hi great team!
Hello world!
Выходные данные:
Hi
great team!

Hello
world!

 */

import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int value = str.indexOf(' ');
        System.out.println(str.substring(0, value));
        System.out.println(str.substring(value+1));


    }
}
