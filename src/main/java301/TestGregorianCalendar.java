package main.java301;
import java.util.GregorianCalendar;
/*
У Java API в пакете java.util есть класс GregorianCalendar, который можно использовать для получения года, месяца и
дня даты. Безаргументный конструктор создает объект типа GregorianCalendar для текущей даты, а методы
get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH) и get(GregorianCalendar.DAY_OF_MONTH) возвращают год,
месяц (от 0 до 11) и день. Напишите программу для выполнения следующих двух задач:

1. Отобразите текущий год, месяц и день.

2. У класса GregorianCalendar есть метод setTimeInMillis(long), который можно использовать для задания указанного
времени, прошедшего с 1 января 1970 г. Установите значение, равное 1234567898765L, и отобразите для него год,
месяц и день.
 */
public class TestGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Год равен " + (calendar.get(GregorianCalendar.YEAR)));
        System.out.println("Месяц равен " + (calendar.get(GregorianCalendar.MONTH) + 1)); // интересно почему?
        System.out.println("День равен " + (calendar.get(GregorianCalendar.DATE)));
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Год равен " + (calendar.get(GregorianCalendar.YEAR)));
        System.out.println("Месяц равен " + (calendar.get(GregorianCalendar.MONTH) + 1)); // интересно почему?
        System.out.println("День равен " + (calendar.get(GregorianCalendar.DATE)));
    }
}
