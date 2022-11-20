package main.home021;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

/*
(3 балла) Решить задачу 7 основного дз за линейное время. Про понятие
линейного времени можно почитать здесь:

Задача 7
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию.
Необходимо создать массив, полученный из исходного возведением в квадрат
каждого элемента, упорядочить элементы по возрастанию и вывести их на
экран.
Входные данные
6
-10 -5 1 3 3 8

2
-7 7

Выходные данные
1 9 9 25 64 100

49 49
 */
public class HomeWork12 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ai = new Integer[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ai[i] = ai[i] * ai[i]; // Math.pow(ai[i],2)
        }

//        Instant startTime = Instant.now(); //момент времени Instant именно в конкретное время

//        Instant endTime = Instant.now();
        long start = System.nanoTime();
        System.out.println(Arrays.toString(ai));
        Arrays.sort(ai);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс " + elapsed);
//        long totalExecutionTime = Duration.between(startTime, endTime).toNanos();
//        System.out.println("Время выполнения операции сортировки массива " + Arrays.toString(ai) + " массива: "
//                + totalExecutionTime + " мс.");


//        Instant startTime1 = Instant.now(); //момент времени Instant именно в конкретное время
        long start1 = System.nanoTime();
        System.out.println(Arrays.toString(ai));

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < ai.length; i++) {
                if (ai[i] < ai[i - 1]) {
                    swap(ai, i, i - 1);
                    needIteration = true;
                }
            }
        }
        long finish1 = System.nanoTime();
        long elapsed1 = finish1 - start1;
        System.out.println("Прошло времени, нс " + elapsed1);
//        Instant endTime1 = Instant.now();
//        long totalExecutionTime1 = Duration.between(startTime1, endTime1).toNanos();
//        System.out.println("Время выполнения операции сортировки массива " + Arrays.toString(ai) + " массива: "
//                + totalExecutionTime1 + " мс.");

        String result = "";
        for (int i : ai) {
            result += i + " ";
        }
        System.out.println(result.trim());

//        System.out.println(Arrays.stream(ai)
//                .map(i -> (int) Math.pow(i, 2))
//                .sorted()
//                .map(Object::toString)
//                .collect(Collectors.joining(" ")));
    }

    private static void swap(Integer[] ai, int ind1, int ind2) {
        int tmp = ai[ind1];
        ai[ind1] = ai[ind2];
        ai[ind2] = tmp;
    }
}
