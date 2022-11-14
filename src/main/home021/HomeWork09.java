package main.home021;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/*
(1 балл) На вход подается число N — длина массива. Затем передается массив
строк из N элементов (разделение через перевод строки). Каждая строка
содержит только строчные символы латинского алфавита.
Необходимо найти и вывести дубликат на экран. Гарантируется что он есть и
только один.

Входные данные
4
hello
java
hi
java

7
today
is
the
most
most
special
day
Выходные данные
java

most
 */
public class HomeWork09 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[] {"\n"};
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextLine();
    }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                boolean flag = Arrays.equals(arr[i], arr[j]);
//                System.out.println(flag);
}


