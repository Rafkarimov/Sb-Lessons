package main.java106;

import java.util.Scanner;

public class SumScores {
    public static void main(String[] args) {
        final int SENTINEL = -99;

        int sum, score;

        Scanner input = new Scanner(System.in);

        // Получить баллы за первый экзамен
        System.out.print("Введите баллы за первый экзамен или "
                + SENTINEL + " для выхода: ");
        score = input.nextInt();

        // До тех пор, пока не получена сигнальная метка,
        // получать баллы за следующий экзамен и накапливать их сумму
        sum = 0;
        while (score != SENTINEL) {
            sum += score;
            System.out.print("Введите баллы за следующий экзамен или "
                    + SENTINEL + " для выхода: ");
            score = input.nextInt();
        }

        // Отобразить сумму баллов за все ЕГЭ
        System.out.println("Сумма баллов за все экзамены равна " + sum);
    }
}
