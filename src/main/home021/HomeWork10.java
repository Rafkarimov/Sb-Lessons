package main.home021;

import java.util.Random;
import java.util.Scanner;

/*
(1 балл) Необходимо реализовать игру. Алгоритм игры должен быть записан в
отдельном методе. В методе main должен быть только вызов метода с
алгоритмом игры.
Условия следующие:
Компьютер «загадывает» (с помощью генератора случайных чисел) целое
число M в промежутке от 0 до 1000 включительно. Затем предлагает
пользователю угадать это число. Пользователь вводит число с клавиатуры.
Если пользователь угадал число M, то вывести на экран "Победа!". Если
введенное пользователем число меньше M, то вывести на экран "Это число
меньше загаданного." Если введенное число больше, то вывести "Это число
больше загаданного." Продолжать игру до тех пор, пока число не будет отгадано
или пока не будет введено любое отрицательное число.
1. делаем бесконечный цикл
2. несколько ифов
 */
public class HomeWork10 {
    public static void main(String[] args) {
        var random = new Random().nextInt(1001); // загадали число
//        System.out.println(random); // чтоб видеть какое число загадали
        var sc = new Scanner(System.in);
        while (true) { // бесконечный цикл
            int n = sc.nextInt();
            if (n == random) {
                System.out.println("Победа!");
                break;
            } else if (n < random) {
                if (n < 0) {
                    break;
                }
                System.out.println("Это число меньше загаданного.");
            } else {
                System.out.println("Это число больше загаданного.");
            }
        }
    }


    public static void generation(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
//            boolean flag =
//            if ()
        }
    }
}

