package main.home011;
/*
На вход подается количество секунд, прошедших с начала текущего дня – count.
Выведите в консоль текущее время в формате: часы и минуты
Входные данные:
32433 41812
Выходные данные:
9 0   11 36
 */
import java.util.Scanner;

public class HomeWork04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int minutes = count / 60;
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(hour + " " + remainingMinutes);
    }
}
