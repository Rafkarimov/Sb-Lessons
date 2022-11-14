package main.home021;

import java.util.Scanner;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
целых чисел (ai) из N элементов, отсортированный по возрастанию.
Необходимо вывести на экран построчно сколько встретилось различных
элементов. Каждая строка должна содержать количество элементов и сам
элемент через пробел.
Входные данные
6
7 7 7 10 26 26

2
-5 7

Выходные данные
3 7
1 10
2 26

1 -5
1 7
 */
public class HomeWork04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        int sumOffUniqueNumbers = 0;
        int temp = ai[0];
//        for (int i = 0; i < n - 1; i += sumOffUniqueNumbers) {
//            sumOffUniqueNumbers = 1;
//            for (int j = i + 1; j < n; j++) {
//                if (ai[i] == ai[j]) {
//                    sumOffUniqueNumbers++;
//                } else if (ai[i] != ai[j]) {
//                    System.out.println(sumOffUniqueNumbers + " " + ai[i]);
//                    break;
//                }
//            }
//        }

        for (int i = 0; i < n; i++) {
            if (ai[i] == temp) {
                sumOffUniqueNumbers++;
            } else if ((ai[i] != temp || i == n - 1)) {
                System.out.println(sumOffUniqueNumbers + " " + temp);
                sumOffUniqueNumbers = 1;
            }
            temp = ai[i];
        }
        System.out.println(sumOffUniqueNumbers + " " + temp);
    }
}
