package main.java106;

public class TestContinue {
    public static void main(String[] args) {
        int sum, number;

        sum = 0;
        number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11)
                continue;
            sum += number;
        }
        System.out.println("Сумма равна " + sum);
    }
}