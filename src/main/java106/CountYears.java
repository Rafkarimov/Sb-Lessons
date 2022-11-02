package main.java106;
/*
В городе, чье население с каждым годом растет на 10%, живет 9 870 человек. Напишите программу, которая отображает
ежегодную численность населения и определяет, через сколько лет (count_years) она будет превышать 30 000 человек.
 */

public class CountYears {
    public static void main(String[] args) {
        for (int i = 9870; i < 30000; i += (i * 10 / 100)) {
            System.out.println(i);
        }
    }
}

