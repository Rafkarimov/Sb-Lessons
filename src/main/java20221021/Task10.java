package main.java20221021;

import java.util.Scanner;

/*
Задача 10
Дана последовательность, состоящая из 9ти символов, разделенных через пробел.
Необходимо конкатенировать их в одну строку и вывести эту строку, исключая цифры.Вход Выход
H e 1 2 3 l l 4 o Hello
1 2 3 T 4 5 e a m Team
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        String str4 = scanner.next();
        String str5 = scanner.next();
        String str6 = scanner.next();
        String str7 = scanner.next();
        String str8 = scanner.next();
        String str9 = scanner.next();

        String result = "";

        if ((str1.charAt(0) >= 'a' && str1.charAt(0) <= 'z') || (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z')) {
            result += str1;
        }
        if (Character.isDigit(str2.charAt(0))) {
            result += str2;
        }

        if ((str3.charAt(0) >= 'a' && str3.charAt(0) <= 'z') || (str3.charAt(0) >= 'A' && str3.charAt(0) <= 'Z')) {
            result += str3;
        }

        if ((str4.charAt(0) >= 'a' && str4.charAt(0) <= 'z') || (str4.charAt(0) >= 'A' && str4.charAt(0) <= 'Z')) {
            result += str4;
        }

        if ((str5.charAt(0) >= 'a' && str5.charAt(0) <= 'z') || (str5.charAt(0) >= 'A' && str5.charAt(0) <= 'Z')) {
            result += str5;
        }

        if ((str6.charAt(0) >= 'a' && str6.charAt(0) <= 'z') || (str6.charAt(0) >= 'A' && str6.charAt(0) <= 'Z')) {
            result += str6;
        }

        if ((str7.charAt(0) >= 'a' && str7.charAt(0) <= 'z') || (str7.charAt(0) >= 'A' && str7.charAt(0) <= 'Z')) {
            result += str7;
        }

        if ((str8.charAt(0) >= 'a' && str8.charAt(0) <= 'z') || (str8.charAt(0) >= 'A' && str8.charAt(0) <= 'Z')) {
            result += str8;
        }

        if ((str9.charAt(0) >= 'a' && str9.charAt(0) <= 'z') || (str9.charAt(0) >= 'A' && str9.charAt(0) <= 'Z')) {
            result += str9;
        }

    }
}
