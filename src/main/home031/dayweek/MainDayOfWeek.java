package main.home031.dayweek;

import java.util.Arrays;
import java.util.stream.Stream;

/*
5.	Необходимо реализовать класс DayOfWeek для хранения порядкового номера дня недели (byte) и названия
дня недели (String).
Затем в отдельном классе в методе main создать массив объектов DayOfWeek длины 7. Заполнить его соответствующими
значениями (от 1 Monday до 7 Sunday) и вывести значения массива объектов DayOfWeek на экран.
Пример вывода:
1 Monday
2 Tuesday
…
7 Sunday

 */
public class MainDayOfWeek {
    public static void main(String[] args) {
        DayOfWeek[] dayOfWeeksArray = new DayOfWeek[7];
        System.arraycopy(DayOfWeek.values(), 0, dayOfWeeksArray, 0, DayOfWeek.values().length);
//        Arrays.stream(dayOfWeeksArray) // вариант через стримы
//                .forEach(System.out::println);
        for (DayOfWeek dayOfWeek : dayOfWeeksArray) {
            System.out.println(dayOfWeek);
        }
    }


}
