package main.java201;
/*
Входные данные:
int n1; // первое число
int n2; // второе число

Переменные программы:
int k; // счетчик

Выходные данные:
int gcd; // НОД двух чисел

Алгоритм с уточнениями:

1. Получить первое число.

2. Получить второе число.

3. Вычислить НОД двух чисел.

   3.1. Пусть НОД равен 1.

   3.2. До тех пор, пока первое и второе число больше или равны предполагаемому НОД.

      3.2.1. Если первое и второе число делятся без остатка на предполагаемый НОД, то

         3.2.1.1. Обновить НОД.

      3.2.2. Увеличить предполагаемый НОД на 1.

4. Отобразить НОД двух чисел.
 */
import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    /**
     * Метод main
     */
    public static void main(String[] args) {
        int n1, n2, gcd;

        Scanner input = new Scanner(System.in);

        // Получить два числа
        System.out.print("Введите первое число: ");
        n1 = input.nextInt();
        System.out.print("Введите второе число: ");
        n2 = input.nextInt();

        // Вычислить НОД двух чисел
        gcd = find_gcd(n1, n2);

        // Отобразить НОД двух чисел
        System.out.println("Наибольший общий делитель " + n1 +
                " и " + n2 + " равен " + gcd);
    }

    /**
     * Возвращает НОД двух чисел
     */
    public static int find_gcd(int n1, int n2) {
        int gcd, k;
        gcd = 1; // НОД инициализируется с 1
        k = 1; // предполагаемое значение НОД

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // НОД обновляется
            k++;
        }

        return gcd; // НОД возвращается
    }
}