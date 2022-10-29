package main.java106;
/*
Написать программу, которая вычисляет ежемесячные проценты по вкладу (без капитализации), исходя из введенных
пользователем месяца и года открытия вклада, срока вклада в месяцах, годовой процентной ставки и суммы вклада в рублях.
Пусть количество дней в году будет всегда равно 365, т.е. високосные года в вычислениях не учитываются.

Для работы с датами будем исплоьзовать класс LocalDate из пакета java.time. Класс java.time.LocalDate представляет
по умолчанию даты в формате yyyy-MM-dd, где yyyy — год, MM — месяц и dd — день месяца.
Метод lengthOfMonth() возвращает продолжительность месяца для конкретной даты — 28, 29, 30 или 31 — и не
требует параметра
int lengthOfMonth = LocalDate.of(2021, 1, 1).lengthOfMonth(); // возвращает 31

вводные данные
номер месяца открытия вклада:3
введите год открытия вклада: 2021
введите срок вклада в месяцах: 24
Введите сумму вклада: 1000
Введите годовую процентную ставку: 5
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DepositCalculation {
    static final int MONTHS_OF_YEAR = 12; //месяцев в году
    static final int DAYS_YEAR = 365; // дней в году

    public static void main(String[] args) {
        int startMonth; // номер месяца открытия вклада
        int startYear; // год открытия вклада
        int depositTerm; // срок вклада в месяцах
        double rate; // процентная ставка (% годовых)
        double depositAmount; // сумма вклада
        double accruedInteresPerMonth;
        double accruedInteresPerTotal = 0;

        Scanner input = new Scanner(System.in);

        //Получить номер месяца открытия вклада
        System.out.println("Введите номер месяца открытия вклада: ");
        startMonth = input.nextInt();

        //Получить год открытия вклада
        System.out.println("Введите год открытия вклада: ");
        startYear = input.nextInt();

        //Получить срок вклада в месяцах
        System.out.println("Введите срок вклада в месяцах: ");
        depositTerm = input.nextInt();

        //Получить сумму вклада в рублях
        System.out.println("Введите сумму вклада: ");
        depositAmount = input.nextDouble();

        //Получить годовую процентную ставку
        System.out.println("Введите годовую процентную ставку: ");
        rate = input.nextDouble();

        int monthsCount = 0; // счетчик месяцев
        int i = startYear;
        while (monthsCount < depositTerm) {
            for (int j = 1; j <= MONTHS_OF_YEAR; j++) {
                //Если номер месяца меньше или равно номеру месяца открытия вклада
                //то переходим к следующему месяцу, он не попадает в интервал
                if (i == startYear && j <= startMonth) {
                    continue;
                }

                //Если номер текущего месяца равен сроку вклада,
                //то расчет заканчиваем и выходим из цикла
                if (monthsCount == depositTerm) {
                    break;
                }

                //Получаем количество дней в текущем месяце
                int lengthOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();

                //Рассчитаем доход по вкладу в текущем месяце
                accruedInteresPerMonth = depositAmount * rate / 100 / DAYS_YEAR * lengthOfMonth;
                accruedInteresPerMonth = Math.round(accruedInteresPerMonth * 100) / 100.0; // округление до копейки

                //Вывести результат начисленных процентов в месяце
                System.out.println("Начисленно процетов в " + i + " году " + j + " месяца = " + accruedInteresPerMonth);

                //Добавим процент по владам текущего месяца к суммарной выплате
                accruedInteresPerTotal = accruedInteresPerTotal + accruedInteresPerMonth;

                monthsCount++; //Увеличим счетчик месяцев на 1

            }
            i++; // увеличим год на 1
        }
        //Вывести итоговый результат начисленных процентов
        System.out.println("Всего начисленных процентов = " + accruedInteresPerTotal);
    }
}
