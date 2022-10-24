package main.home012;

import java.util.Scanner;

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
        String password = scanner.nextLine();
        String count = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_*-])(?=\\S+$).{0,8}$";

        if (count == password) {
            System.out.println("пароль надежный");
        } else {
            System.out.println("пароль не прошел проверку");
        }

//
//        if (password.length() >= 8) {
//            for (int i = 0; i < password.length(); i++) {
//                int c = password.charAt(i);
//                if (Character.isUpperCase(c) && Character.isLowerCase(c) && Character.isDigit(c) &&
//                        (c == 95 || c == 42 || c == 45)) {
//                    System.out.println("пароль надежный");
//                } else {
//                    System.out.println("пароль не прошел проверку");
//                }
//            }
//        }
    }
}


//        for (int i = 0; i < password.length(); i++) {
//            int c = password.charAt(i);
//            if (password.length() >= 8 && Character.isUpperCase(c) && Character.isLowerCase(c) && Character.isDigit(c) &&
//                    (c == 95 || c == 42 || c == 45)) {
//                System.out.println("пароль надежный");
//            } else {
//                System.out.println("пароль не прошел проверку");
//            }
//        }

//        if (password.length() < 8) {
//            System.out.println("пароль не прошел проверку");
//        } else {
//            char c;
//            for (int i = 0; i < password.length(); i++) {
//                c = password.charAt(i);
//                if (!Character.isLetterOrDigit(c)) {
//                    System.out.println("пароль не прошел проверку");
//                    ;
//                } else {
//                    if (!Character.isDigit(c)) {
//                        System.out.println("пароль не прошел проверку");
//                        ;
//                    } else {
//                        System.out.println("пароль надежный");
//                    }
//                }
//            }
//        }


//        int upCount = 0;
//        int loCount = 0;
//        int digit = 0;
//        int special = 0;
//
//        if (password.length() >= 8) {
//            for (int i = 0; i < password.length(); i++) {
//                char c = password.charAt(i);
//                if (Character.isUpperCase(c)) {
//                    upCount++;
//                }
//                if (Character.isDigit(c)) {
//                    digit++;
//                }
//                if (Character.isLowerCase(c)) {
//                    loCount++;
//                }
//                if (c == 95 || c == 42 || c == 45) {
//                    special++;
//                }
//            }
//            if (special > 1 && loCount > 1 && upCount > 1 && digit >= 1) {
//                System.out.println("пароль надежный");
//            } else {
//                System.out.println("пароль не прошел проверку");
//            }
//        }


//        if ((str.length() >= 8) && (isUpperCase(str)) &&
//                isLowerCase(Integer.parseInt(str)) && isDigit(Integer.parseInt(str)) &&
//                isValidCodePoint(Integer.parseInt(str))) {
//            System.out.println("пароль надежный");
//        } else {
//            System.out.println("пароль не прошел проверку");
//        }



