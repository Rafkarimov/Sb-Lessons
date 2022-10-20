package main.home01;

import java.util.Scanner;

public class homeWork01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        double r = scanner.nextDouble();

        double v = 4.0 / 3.0 * (Math.PI) * (Math.pow(r,3));
        System.out.println(v);
    }
}
