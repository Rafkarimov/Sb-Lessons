package main.home021;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
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
public class HomeWork07 {
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
        Arrays.sort(ai);
        String result = "";
        for (int i : ai) {
            result += i + " ";
        }
        System.out.println(result.trim());
        System.out.println(Arrays.stream(ai)
                .map(i -> (int) Math.pow(i, 2))
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
