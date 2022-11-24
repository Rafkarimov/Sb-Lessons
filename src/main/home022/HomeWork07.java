package main.home022;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
import java.util.stream.IntStream;

/*
7.	Раз в год Петя проводит конкурс красоты для собак. К сожалению, система хранения участников и оценок неудобная,
а победителя определить надо. В первой таблице в системе хранятся имена хозяев, во второй - клички животных,
в третьей — оценки трех судей за выступление каждой собаки. Таблицы связаны между собой только по индексу.
То есть хозяин i-ой собаки указан в i-ой строке первой таблицы, а ее оценки — в i-ой строке третьей таблицы.
Нужно помочь Пете определить топ 3 победителей конкурса.

На вход подается число N — количество участников конкурса. Затем в N строках переданы имена хозяев. После этого
в N строках переданы клички собак. Затем передается матрица с N строк, 3 вещественных числа в каждой — оценки судей.
Победителями являются три участника, набравшие максимальное среднее арифметическое по оценкам 3 судей. Необходимо
вывести трех победителей в формате “Имя хозяина: кличка, средняя оценка”.

Гарантируется, что среднее арифметическое для всех участников будет различным.

Ограничения:
0 < N < 100

Входные данные
4
Иван
Николай
Анна
Дарья
Жучка
Кнопка
Цезарь
Добряш
7 6 7
8 8 7
4 5 6
9 9 9

Выходные данные
Дарья: Добряш, 9.0
Николай: Кнопка, 7.6
Иван: Жучка, 6.6

 */
public class HomeWork07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] humanNames = new String[n];
        for (int i = 0; i < n; i++) {
            humanNames[i] = sc.next();
        }
        String[] dogNames = new String[n];
        for (int i = 0; i < n; i++) {
            dogNames[i] = sc.next();
        }
        int ratings = 3;
        int[][] arr = new int[n][ratings];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ratings; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] ratingSums = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ratingSums[i] += arr[i][j];
            }
        }
        int minimumRatingSum = Integer.MAX_VALUE;
        int minimumRatingRowIndex = 0;
        Integer[] winnersRatings = new Integer[n - 1];
        for (int i = 0; i < ratingSums.length; i++) {
            if (ratingSums[i] < minimumRatingSum) {
                minimumRatingSum = ratingSums[i];
//                winnersRatings[i > n - 2 ? i - 1 : i] = ratingSums[i];
                minimumRatingRowIndex = i;
            }
        }
        for (int i = 0; i < ratingSums.length; i++) {
            if (i != minimumRatingRowIndex) {
                winnersRatings[i > winnersRatings.length - 1 ? i - 1 : i] = ratingSums[i];
            }
        }
        Arrays.sort(winnersRatings, Collections.reverseOrder());
        Map<String, Double> map = new HashMap<>();
        IntStream.range(0, ratingSums.length)
                .forEach(i -> map.put(humanNames[i] + ": " + dogNames[i] + ", ", (double) ratingSums[i]));

//        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
//        decimalFormatSymbols.setDecimalSeparator('.');
//        DecimalFormat decimalFormat = new DecimalFormat(".#", decimalFormatSymbols);
//        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(3)
                .forEach(e -> {
                    BigDecimal bd = BigDecimal.valueOf(e.getValue() / ratings);
                    bd = bd.setScale(1, RoundingMode.DOWN);
                    System.out.println(e.getKey() + bd);
                });

//        for (int i = 0; i < n; i++) {
//            if (i != minimumRatingRowIndex) {
//
//                double averageRating = Math.round((ratingSums[i] / (double) ratings * 100) * 10) / 10.0;
//                Math.round((num / sum * 100) * 10) / 10.0;
//                System.out.println(humanNames[i] + ": " + dogNames[i] + ", " + averageRating);
//            }
//        }
//        System.out.println(Arrays.toString(winnersRatings));
//        System.out.println(minimumRatingRowIndex + " " + Arrays.toString(ratingSums));
//        System.out.println(Arrays.toString(humanNames));
//        System.out.println("--------------");
//        System.out.println(Arrays.toString(dogNames));
//        System.out.println("---------------");
//        printArray(arr);


//        int mOfAr = meanOfArithmetic(arr, n, ratings);
//        System.out.println(mOfAr);


    }

    private static int meanOfArithmetic(int[][] arr, int n, int assessments) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < assessments; j++) {
                sum += i;
            }
        }
        return sum;
    }

    private static void printArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j] + (j == i.length - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
