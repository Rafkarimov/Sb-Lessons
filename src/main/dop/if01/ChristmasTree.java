package main.dop.if01;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows + 1; i++) {
            String str1 = i < rows ? "*".repeat(i + 1) : "|";
            String str2 = i < rows ? "*".repeat(i) : "";
            String format = String.format("%1$" + rows + "s%2$s%n", str1, str2);

            sb.append(format);
        }

        String christmasTree = sb.toString();

        System.out.println(christmasTree);
    }
}
