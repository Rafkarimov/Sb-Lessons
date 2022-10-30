package main.home013;

import java.util.Scanner;

/*
Дана строка s. Вычислить количество символов в ней, не считая пробелов
(необходимо использовать цикл)
Входные данные:
Hello world
Never give up

Выходные данные:
10
11
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
//            if (str.charAt(i) != ' ') { // substring(i,i+1).equals(" ")
                count++;
            }
        }
        System.out.println(count);

//        System.out.println(str.replaceAll("\\s", "").length());


//        int value = str.indexOf(' ');
//        int i, j, k;
//
//        for (i = 0; i < str.indexOf(' '); i++) {
//            System.out.println(i);
//        }


    }
}

