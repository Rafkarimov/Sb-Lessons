package main.home012;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String regex = "^(?=.*[\\d])(?=.*[a-z])(?=.*[A-Z])(?=.*[-_*]).{8,}$";
        if (password.matches(regex)) {
            System.out.println("пароль надежный");
        } else {
            System.out.println("пароль не прошел проверку");
        }
    }
}

