package main.java301;

import java.security.SecureRandom;

import java.util.Random;

/*
Напишите программу, которая создает объект типа Random с начальным (случайным) значением 1000 и отображает первые
50 случайных целых чисел между 0 и 100 с помощью метода nextInt(100).
 */
public class TestRandom {
    public static void main(String[] args) {
        byte[] r = new byte[1000];
        SecureRandom random = new SecureRandom(r);
        for (int i = 0; i < 50; i++) {
            System.out.println(random.nextInt(100) + " ");
        }
    }
//     Random random = new Random(1000);
//     for (int i = 0; i < 50; i++) {
//     System.out.println(random.nextInt(100) + " ");
//     }
}
