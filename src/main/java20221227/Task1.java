package main.java20221227;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        divide(100, 0);
    }
    private static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw new MyArithmeticException();
        }
    }
}
