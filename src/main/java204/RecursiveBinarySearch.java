package main.java204;
/*
Случай №1 и случай №3 приводят к поиску ключа в меньшем массиве. Случай №2 является простым случаем, когда имеется
совпадение. Другим простым случаем является завершение поиска без совпадения. В программе RecursiveBinarySearch
дается ясное и простое решение задачи бинарного поиска с помощью рекурсии.
 */
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] list = {3, 5, 7, 8, 12, 17, 24, 29};
        System.out.println(recursiveBinarySearch(list, 7));
        System.out.println(recursiveBinarySearch(list, 0));
    }

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key,
                                             int low, int high) {
        if (low > high) // поиск завершается без единого совпадения
            return -low - 1;

        int mid = (low + high) / 2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }
}