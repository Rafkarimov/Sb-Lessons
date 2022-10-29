package main.java106;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1, number2, answer;

        Scanner input = new Scanner(System.in);

        // Сгенерировать два случайных целых числа number1 и number2
        number1 = (int)(Math.random() * 10);
        number2 = (int)(Math.random() * 10);

        // Получить ответ на вопрос "Сколько будет number1 + number2?"
        System.out.print(
                "Сколько будет " + number1 + " + " + number2 + "? ");
        answer = input.nextInt();

        // До тех пор, пока ответ неправильный, запрашивать новый ответ
        while (number1 + number2 != answer) {
            System.out.println("Неправильный ответ. Попробуйте еще раз. ");
            System.out.print("Сколько будет " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("Вы угадали!");
    }
}

