package main.java301;

import java.util.Date;

/*
Напишите программу, которая создает объект Date, устанавливает у него прошедшее время, равным 10000, 100000, 1000000,
10000000, 100000000, 1000000000, 10000000000 и 100000000000, и отображает дату и время с помощью метода toString(),
соответственно.
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();

        int count = 1;
        long time = 10000;
        while (count <= 8) {
            date.setTime(time);
            System.out.println(date.toString());
            count++;
            time *= 10;
        }
    }
}
