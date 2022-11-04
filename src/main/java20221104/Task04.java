package main.java20221104;

import java.util.Scanner;

/*
 Начальный вклад в банке равен 1000.
    Каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (0 < P < 25).
    Найти через какое количество времени размер вклада будет больше 1100 и вывести
    найденное количество месяцев и итоговой размер вклада.

    Входные данные
    15
    Выходные данные
    1
    1150.0

    Входные данные
    3
    Выходные данные
    4
    1125.50881

 */
public class Task04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int p = sc.nextInt();
        double start = 1000;
        int limit = 1100;

        int count = 0;//количество месяцев

        while (start < limit) {
            start += start *p/100.0; //как получить проценты
            count++;
        }
        System.out.println("Количество месяцев: " + count + "\nИтоговая сумма: " + start);
    }
}
