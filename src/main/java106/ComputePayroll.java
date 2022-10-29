package main.java106;

import java.util.Scanner;

public class ComputePayroll {
    public static void main(String[] args) {
        int number_emp, count_emp;
        double hours, rate, pay, total_pay;

        Scanner input = new Scanner(System.in);

        // Получить количество сотрудников в компании
        System.out.print("Введите количество сотрудников в компании: ");
        number_emp = input.nextInt();

        // До тех пор, пока не обработаны все сотрудники, вычислять и
        // отображать зарплату каждого сотрудника и прибавлять ее
        // к общей зарплате компании
        total_pay = 0.0;
        count_emp = 0;
        while (count_emp < number_emp) {
            // Получить отработанные часы для текущего сотрудника
            System.out.print("Введите отработанные часы: ");
            hours = input.nextDouble();

            // Получить часовую ставку для текущего сотрудника
            System.out.print("Введите часовую ставку в рублях: ");
            rate = input.nextDouble();

            // Вычислить и отобразить зарплату текущего сотрудника в рублях
            pay = hours * rate;
            System.out.println("Зарплата равна " + pay + " руб.");

            // Прибавить зарплату текущего сотрудника к общей зарплате компании
            total_pay += pay;

            // Перейти к следующему сотруднику
            ++count_emp;
        }
        System.out.println("\nВсе сотрудники обработаны.\n");

        // Отобразить общую зарплату компании в рублях
        System.out.println("Общая зарплата компании равна "
                + total_pay + " руб.");
    }
}
