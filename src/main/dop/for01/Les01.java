package main.dop.for01;

import java.util.Scanner;

public class Les01 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int x1 = in.nextInt();
        for (int i = 1; i < 5; i++) {
            int x2 = in.nextInt();
            if (x2 > x1) System.out.println(x2);
            x1 = x2;
        }
    }
}
