package main.java106;

/*
Напишите программу, которая отображает таблицу умножения для чисел от 0 до 9.
 */
public class Test3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                sum = j * i;
                System.out.println(i + " x " + j + " = " + sum);
            }
        }
    }
}

