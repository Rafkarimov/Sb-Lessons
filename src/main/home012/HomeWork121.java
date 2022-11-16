package main.home012;

import java.util.Scanner;

public class HomeWork121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean containsSpecialSymbol = false;
        boolean containsSpecialDigit = false;
        boolean containsUpCaseLetter = false;
        boolean containsLowCaseLetter = false;

        for (int i = 0; i < password.length(); ++i) {
            char c = password.charAt(i);
            if (c == '_' || c == '*' || c == '-') {
                containsSpecialSymbol = true;
            }

            if (Character.isDigit(c)) {
                containsSpecialDigit = true;
            }

            if (Character.isUpperCase(c)) {
                containsUpCaseLetter = true;
            }

            if (Character.isLowerCase(c)) {
                containsLowCaseLetter = true;
            }
        }

        if (containsSpecialSymbol && containsSpecialDigit && containsUpCaseLetter && containsLowCaseLetter) {
            System.out.println("пароль надежный");
        } else {
            System.out.println("пароль не прошел проверку");
        }

    }
}
