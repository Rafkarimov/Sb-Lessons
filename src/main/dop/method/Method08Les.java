package main.dop.method;
/*
Напишите метод, который принимает в качестве параметра число и
возвращает:
• -1 - в случае если число отрицательное;
• О - в случае если число равно О;
• 1 - в случае если число положительное.
 */
import java.util.Scanner;

public class Method08Les {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y;
        x = in.nextInt();
        y = what(x);
        System.out.println(y);
    }

    public static int what(int temp) {
        if (temp < 0)
            return -1;
        if (temp == 0)
            return 0;
        return 1;
    }
}
