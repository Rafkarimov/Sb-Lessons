package main.home011;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double v = 4 / 3.0 * Math.PI * Math.pow(r, 3);
        System.out.println(v);
    }
}

