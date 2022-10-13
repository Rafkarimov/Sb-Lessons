package main.java103;

public class ShowCurrentTimeGtm3 {
    public static void main(String[] args) {
        final int MILLISECONDS_PER_SECOND = 1000, SECONDS_PER_MINUTE = 60,
                MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24, MILLISECONDS_PER_THREEHOUR = 10800000;

        long totalMilliseconds, totalSeconds, currentSecond,
                totalMinutes, currentMinute, totalHours, currentHour;

        // Получить общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970
        totalMilliseconds = System.currentTimeMillis() + MILLISECONDS_PER_THREEHOUR;

        // Вычислить общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;

        // Вычислить текущее кол-во секунд
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;

        // Вычислить общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;

        // Вычислить текущее кол-во минут
        currentMinute = totalMinutes % MINUTES_PER_HOUR;

        // Вычислить общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970
        totalHours = totalMinutes / MINUTES_PER_HOUR;

        // Вычислить текущее кол-во часов по Гринвичу
        currentHour = totalHours % HOURS_PER_DAY;

        // Отобразить текущее время по Гринвичу
        System.out.println("Текущее время равно " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT3.");
    }
}
