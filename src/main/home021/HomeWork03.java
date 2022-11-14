package main.home021;

import java.util.Scanner;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию. После этого
вводится число X — элемент, который нужно добавить в массив, чтобы
сортировка в массиве сохранилась.
Необходимо вывести на экран индекс элемента массива, куда нужно добавить
X. Если в массиве уже есть число равное X, то X нужно поставить после уже
существующего.

Входные данные
6
10 20 30 40 45 60
12

5
-1 0 2 2 3
2

Выходные данные
1

4
 */
public class HomeWork03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (ai[i] > x) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
