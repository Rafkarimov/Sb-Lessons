package main.java106;
/*
Напишите программу, которая отображает в консоли следующие выходные данные:
0 1
1 2
2 4
3 8
4 16
5 32
6 64
это 2 в степени, от 0 до 6
 */


public class Test {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            System.out.println(i + " " + (int)Math.pow(2, i));
        }
    }
}
