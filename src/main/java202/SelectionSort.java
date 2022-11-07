package main.java202;
/*
Задание
Измените метод selectionSort() таким образом, чтобы отсортировать числа в порядке убывания.
 */
public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        SelectionSort.selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    /**
     * Сортирует массив методом выбора
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Найти наименьшее значение в list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Переставить list[i] и list[currentMinIndex], если необходимо
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}