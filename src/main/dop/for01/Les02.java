package main.dop.for01;

import java.util.Scanner;

/*
Напишите класс, который выполняет следующие действия:
1. Принимает с клавиатуры два целых числа.
2. Создает и выводит на экран 20 случайных чисел в диапазоне от
первого, только что введенного с клавиатуры, значения, - до второго значения, также введенного с клавиатуры перед
этим. Можно исходить из предположения, что первое из вводимых чисел
всегда меньше второго.
Например, если с клавиатуры были введены значения -8 и 17, то класс
создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти
значения).
num1 > num2;
 */
public class Les02 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = 0; i < 20; i++){
            System.out.println(num1+(int)(Math.random() * ((num2-num1)+1)));
        }
    }
}