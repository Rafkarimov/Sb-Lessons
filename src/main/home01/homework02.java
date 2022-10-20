package main.home01;

import java.util.Scanner;

public class homework02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
        System.out.println(c);
    }
}
