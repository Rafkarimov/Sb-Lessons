package main.java102;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введи значение: ");
        int i = input.nextInt();
        double d = input.nextDouble();
        System.out.println("Ответ решения = " + i + d);
    }
}
