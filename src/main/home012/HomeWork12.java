package main.home012;

import java.util.Scanner;

import static java.lang.Character.*;

/*
1.	(2 балла) У Марата был взломан пароль. Он решил написать программу, которая проверяет его пароль на сложность.
В интернете он узнал, что пароль должен отвечать следующим требованиям:
●	пароль должен состоять из хотя бы 8 символов;
●	в пароле должны быть:
○	заглавные буквы
○	строчные символы
○	числа
○	специальные знаки(_*-)
Если пароль прошел проверку, то программа должна вывести в консоль строку пароль надежный, иначе строку:
пароль не прошел проверку
Входные данные:
Hello_22
world234
Выходные данные:
пароль надежный
пароль не прошел проверку
 */
public class HomeWork12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


//        if ((str.length() >= 8) && (isUpperCase(str)) &&
//                isLowerCase(Integer.parseInt(str)) && isDigit(Integer.parseInt(str)) &&
//                isValidCodePoint(Integer.parseInt(str))) {
//            System.out.println("пароль надежный");
//        } else {
//            System.out.println("пароль не прошел проверку");
//        }

    }
}

