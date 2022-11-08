package main.dop.method;
/*
Напишите метод, который получает следующие параметры: координаты
центра круга, радиус круга и координаты некой точки.
Метод должен проверить, находится ли данная точка внутри круга.
 */

import java.util.Scanner;

public class Method40 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int x0 = sc.nextInt();
        int y0 = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean ans = what(x0, y0, r, x, y);
        System.out.println(ans);
    }

    public static boolean what(int x0, int y0, int r, int x, int y) {
        int dx = x - x0;
        int dy = y - y0;
        double dist = Math.sqrt(dx * dx + dy * dy);
        if (dist < r) {
            return true;
        }
        return false;
    }
}
