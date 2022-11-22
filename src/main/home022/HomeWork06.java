package main.home022;

import java.util.Arrays;
import java.util.Scanner;

/*
6.	Петя решил начать следить за своей фигурой. Но все существующие приложения для подсчета калорий ему не понравились
и он решил написать свое. Петя хочет каждый день записывать сколько белков, жиров, углеводов и калорий он съел,
а в конце недели приложение должно его уведомлять, вписался ли он в свою норму или нет.

На вход подаются числа A — недельная норма белков, B — недельная норма жиров, C — недельная норма углеводов и K —
недельная норма калорий. Затем передаются 7 строк, в которых в том же порядке указаны сколько было съедено Петей
нутриентов в каждый день недели. Если за неделю в сумме по каждому нутриенту не превышена недельная норма, то вывести
“Отлично”, иначе вывести “Нужно есть поменьше”.

Ограничения:
●	0 < A, B, C < 2000
●	0 < ai, bi, ci < 2000
●	0 < K < 20000
●	0 < ki < 20000

Входные данные

882 595 1232 17500
116 85 76 2300
100 98 124 2500
182 70 154 2750
114 85 74 1900
96 77 60 1890
110 96 98 2500
155 67 124 2500

882 595 1232 17500
142 85 76 2300
100 93 124 2500
282 70 144 3350
114 85 74 1900
96 77 60 1890
110 96 98 2500
155 67 124 3790


Выходные данные
Отлично

Нужно есть поменьше
 */
public class HomeWork06 {
    private static final int NUMBEROFDAYS = 7;
    private static final int NUMBEROFPOSITION = 4;

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int[] arrNorma = new int[NUMBEROFPOSITION];
        for (int i = 0; i < NUMBEROFPOSITION; i++) {
            arrNorma[i] = sc.nextInt();
        }

        int[][] arrRealWeak = new int[NUMBEROFDAYS][NUMBEROFPOSITION];
        for (int i = 0; i < NUMBEROFDAYS; i++) {
            for (int j = 0; j < NUMBEROFPOSITION; j++) {
                arrRealWeak[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arrRealWeakAll(arrRealWeak)));
    }

    private static int[] arrRealWeakAll(int[][] arrRealWeak) {
        int[] ret = new int[arrRealWeak.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = arrRealWeak[i][NUMBEROFPOSITION-1];
        }
        return ret;
    }
}