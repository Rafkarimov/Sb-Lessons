package main.java106;

public class TestSum {
    public static void main(String[] args) {
        // Инициализировать sum
        float sum, i;
        sum = 0;
        // Прибавить 0.01, 0.02, ..., 0.99, 1 к sum
        for (i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;

        // Отобразить sum
        System.out.println("Сумма равна " + sum);
    }
}
