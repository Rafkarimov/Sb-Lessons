package main.home011;
/*
Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход
подается количество дюймов, выведите количество сантиметров.
Входные данные:
12 99
Выходные данные:
30.48  251.46
 */
import java.util.Scanner;

public class HomeWork05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inch = scanner.nextDouble();
        double centimetre = inch * 2.54;

        System.out.println(centimetre);
    }
}
