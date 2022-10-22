package main.home01;
/*
Прочитайте из консоли имя пользователя и выведите в консоль строку:
Привет, <имя пользователя>!
Подсказка:
Получите данные из консоли c помощью объекта Scanner, сохраните в
переменную userName и выведите в консоль с помощью System.out.println()
Входные данные:
Иван
Выходные данные:
Привет, Иван!
 */
import java.util.Scanner;

public class homeWork03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
    }
}
