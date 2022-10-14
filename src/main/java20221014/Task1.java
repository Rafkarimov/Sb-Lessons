package main.java20221014;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("a: " + a + "b: " + b + " c: " + c);

        int temp = a;
        a = b;
        c = c;
        c = temp;

        System.out.println("a: " + a + "b: " + b + " c: " + c);
    }
}
