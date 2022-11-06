package main.java202;

import java.util.Scanner;

/*
Напишите программу, которая находит минимальную процентную ставку по кредиту в разных банках.

В этом подразделе на видео демонстрируется решение задачи. Постарайтесь не переходить к просмотру видео до того,
как попробуете самостоятельно решить задачу.

Введем количество процентных ставок равным 5.
Введем процентные ставки 17, 8.5, 11.9, 13, 10.5.
Минимальная процентная ставка по банковскому кредиту равна 8.5.
 */
public class LoanRateMin {
    public static void main(String[] args) {
        int numberOfLoanRates; // количество процентных ставок
        double[] loanRatesArray; // массив процентных ставок
        double loanRateMin = 100; // минимальная процентная ставка

        var in = new Scanner(System.in);

        //Получить количество процентных ставок
        System.out.println("Введите количество процентных ставок: ");
        numberOfLoanRates = in.nextInt();

        loanRatesArray = new double[numberOfLoanRates]; // инициализируем массив

        for (int i = 0; i < numberOfLoanRates; i++) {
            System.out.println("Введите процентную ставку: ");
            loanRatesArray[i] = in.nextDouble();
        }

        for (int i = 0; i < loanRatesArray.length; i++) {
            if (loanRatesArray[i] < loanRateMin) {
                loanRateMin = loanRatesArray[i];
            }
        }

        //Вывести минимальную процентную ставку по банковскому кредиту
        System.out.println("Минимальная процентная ставка по банковскому кредиту равна " + loanRateMin);
    }
}
