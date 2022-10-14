package main.java103;

import java.util.Scanner;

public class FareMeter {
    public static void main(String[] args) {
        int startingFareCounter, finaFareCounter, numberOfKilometers;
        double fare1Km, finalFare;

        Scanner input = new Scanner(System.in);

        //Получить начальный показатель одометра в км
        System.out.println("Введите начальный показатель одометра в км: ");
        startingFareCounter = input.nextInt();

        //Получить конечный показатель одометра в км
        System.out.println("Введите конечный показатель одометра в км: ");
        finaFareCounter = input.nextInt();

        //Получить стоимость 1 км поездки
        System.out.println("Введите стоимость 1 км поездки в руб.: ");
        fare1Km = input.nextDouble();

        //Рассчитываем разницу между начальным показателем одометра в км и конечным показателем
        // одометра в км и вывести на экран
        numberOfKilometers = finaFareCounter - startingFareCounter;
        System.out.println("Количество киломметров поездки:" + numberOfKilometers);

        //Расчитать стоимость поездки исходя из стоимости за 1 км и км пути и вывести на экран
        finalFare = fare1Km * numberOfKilometers;
        System.out.println("Стоимость поездки составляет: " + finalFare);
    }
}
