package main.java20221227;

import java.util.Scanner;

public class Calc {
    private static final Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;
    private char c;

    public void input() {
        a = scanner.nextInt();
        c = scanner.next().charAt(0);
        b = scanner.nextInt();
    }

    public int calculate() {
        switch (c) {
            case '+':
                return sum();
            case '-':
                return sub();
            case '/':
                return integerDiv();
            case '*':
                return mul();
        }

        return 0;
    }

    private int sum() {
        return a + b;
    }

    private int sub() {
        return a - b;
    }

    private int integerDiv() {
//        if (b == 0) throw new MyDivisionByZeroException();
        return a / b;
    }

    private int mul() {
        return a * b;
    }
}

