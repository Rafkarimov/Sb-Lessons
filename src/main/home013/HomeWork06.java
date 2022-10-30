package main.home013;

import java.util.Scanner;

/*
В банкомате остались только купюры номиналом 8 4 2 1. Дано положительное
число n - количество денег для размена. Необходимо найти минимальное
количество купюр с помощью которых можно разменять это количество денег
(соблюсти порядок: первым числом вывести количество купюр номиналом 8,
вторым - 4 и т д)
Входные данные:
51
10
60

Выходные данные:
6 0 1 1
1 0 1 0
7 1 0 0
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTotal = scanner.nextInt();
        int num8;
        int num4;
        int num2;
        int num1;

        num8 = numTotal / 8;
        numTotal %= 8;

        num4 = numTotal / 4;
        numTotal %= 4;

        num2 = numTotal / 2;
        numTotal %= 2;

        num1 = numTotal;
        numTotal %= 1;

        System.out.println(num8 + " " + num4 + " " + num2 + " " + num1);
    }

}
