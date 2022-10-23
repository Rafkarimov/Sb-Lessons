package main.home012;

import java.util.Scanner;

/*
(1 балл) На следующий день на работе Петю и его коллег попросили заполнить анкету. Один из вопросов был про уровень
владения английского. Петя и его коллеги примерно представляют, сколько они знают иностранных слов. Также у них есть
табличка перевода количества слов в уровень владения английском языком. Было бы здорово автоматизировать этот перевод!

На вход подается положительное целое число count - количество выученных иностранных слов. Нужно вывести какому
уровню соответствует это количество.
Входные данные:
count < 500
500 <= count < 1500
1500 <= count < 2500
2500 <= count < 3500
3500 <= count
Выходные данные:
beginner
pre-intermediate
intermediate
upper-intermediate
fluent

 */
public class HomeWork06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
//1200
        /*
        1200 < 500 false
        1200 <= 500 или 1200 < 2500
         */

        if (count < 500) {
            System.out.println("B");
        } else if (count < 1500) {
            System.out.println("pre-intermediate");
        } else if (count < 2500) {
            System.out.println("intermediate");
        } else if (count < 3500) {
            System.out.println("upper-intermediate");
        } else {
            System.out.println("fluent");
        }

//        if (count < 500) {
//            System.out.println("beginner");
//        } else {
//            if (count >= 500 && count < 1500) {
//                System.out.println("pre-intermediate");
//            } else {
//                if (1500 <= count && count < 2500) {
//                    System.out.println("intermediate");
//                } else {
//                    if (2500 <= count && count < 3500) {
//                        System.out.println("upper-intermediate");
//                    } else {
//                        if (3500 <= count) {
//                            System.out.println("fluent");
//                        }
//                    }
//                }
//            }
//        }
    }
}

