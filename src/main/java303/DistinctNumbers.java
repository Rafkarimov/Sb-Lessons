package main.java303;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел, завершив ввод значением 0: ");
        int value;

        do {
            value = input.nextInt(); // считывает входное значение

            if (!list.contains(value) && value != 0)
                list.add(value); // добавляет значение, если его еще нет в списке
        } while (value != 0);

        // Отобразить несовпадающие числа
        System.out.print("Несовпадающие числа: ");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
