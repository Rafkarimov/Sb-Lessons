package main.home013;
/*
Вывести на экран “ёлочку” из символа звездочки (*) заданной высоты N. На N +
1 строке у “ёлочки” должен быть отображен ствол из символа |
Вводыне данные:
3
6
Выходные данные:
#
###
#####
|

#
###
#####
#######
#########
###########
|

количество решеток: 1 3 5 7 9 11
количество пробелов с обеих сторон: 10/2=5 8/2=4 6/2=3 4/2=2 2/2=1
 */

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int maxWidth = num + num - 1;

        for (int i = 1; i <= num; i++) {
            int offset = num - i;
            for (int j = 0; j < maxWidth; j++) {
                if (j < offset) {
                    System.out.print(" ");
                } else if (j < maxWidth - offset) {
                    System.out.print('#');
                }
            }
            System.out.println();
        }
        for (int k = 0; k < maxWidth; k++) {
            int offset = maxWidth % num;
            if (k < offset) {
                System.out.print(" ");
            } else if (k == offset) {
                System.out.print("|");
            }
        }
    }
}
//        System.out.println();


//        for (int i = 0; i < num; i++) { //adding lines
//            for (int j = 0; j < i * 2 + 1; j++) //creating pattern
//                if (i == 0) {
//                    for (int tip = 0; tip < (((num * 2) / 2) - 1); tip++) {
//                        System.out.print(" ");
//                    }
//                    System.out.println("#");
//                } else {
//
//                    System.out.print("#");
//                }
//        }
//                        System.out.println(" ");
//
//                        for (int x = i; x < (num - 2); ++x) { // centering CT
//                            System.out.print(" ");
//                        }
//                    }
//
//                    for (int stump = 0; stump < (((num * 2) / 2) - 1); stump++) {
//
//                        System.out.print(" ");
//                    }
//                    System.out.print("|");
//                }
//
//
