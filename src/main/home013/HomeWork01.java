package main.home013;
/*
Напечатать таблицу умножения от 1 до 9. Входных данных нет. Многоточие в
примере ниже подразумевает вывод таблицы умножения и для остальных чисел
2, 3 и т. д
 */
public class HomeWork01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
