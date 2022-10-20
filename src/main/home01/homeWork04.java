package main.home01;

import java.util.Scanner;

public class homeWork04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int minutes = count / 60;
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(hour + " " + remainingMinutes);
    }
}
