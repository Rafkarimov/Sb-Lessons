package main.java302;

/*
Задание №8: Класс MyTime
Создайте класс MyTime для представления времени. Класс MyTime должен содержать:

Поля данных hour, minute и second, которые представляют время.
Безаргументный конструктор, который создает объект типа MyTime для текущего времени. (Значения полей данных этого
объекта представляют текущее время.)
Конструктор, который создает объект типа MyTime с указанным временем в миллисекундах, прошедших с 00:00,
1 января 1970 г. (Значения полей данных этого объекта будут представлять это время.)
Конструктор, который создает объект типа MyTime с указанными часами, минутами и секундами.
Три getter-метода для полей данных hour, minute и second соответственно.
Метод с именем setTime(long elapseTime), который присваивает объекту новое время с помощью прошедшего времени.
Например, если прошедшее время равно 555550000 миллисекундам, то hour равно 10, minute равно 19, а second равно 10.
Нарисуйте UML-диаграмму класса MyTime, а затем реализуйте этот класс. Напишите клиент этого класса — программу,
которая создает три объекта типа MyTime (с помощью new MyTime(), new MyTime(555550000) и new MyTime(5, 23, 55))
и отображает значениях их полей данных hour, minute и second в формате часы:минуты:секунды.

(Подсказка: первые два конструктора извлекут значения hour, minute и second из прошедшего времени. Для безаргументного
конструктора текущее время может быть получено с помощью метода System.currentTimeMillis(), как было показано
в программе ShowCurrentTime из курса «Основы Java-программирования». Пусть время будет GMT.)
 */
public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        System.out.println(time1.getHour() + ":" +
                time1.getMinute() + ":" + time1.getSecond());

        MyTime time2 = new MyTime(555550000);
        System.out.println(time2.getHour() + ":" +
                time2.getMinute() + ":" + time2.getSecond());

        MyTime time3 = new MyTime(5, 23, 55);
        System.out.println(time3.getHour() + ":" +
                time3.getMinute() + ":" + time3.getSecond());
    }
}

class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this(System.currentTimeMillis());
    }

    public MyTime(long elapsedTime) {
        setTime(elapsedTime);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        // Вычислить количество секунд, прошедших с 00:00, 1 января 1970 г.
        long totalSeconds = elapsedTime / 1000;

        // Вычислить текущую секунду в минуте и часе
        second = (int) (totalSeconds % 60);

        // Вычислить количество минут
        long totalMinutes = totalSeconds / 60;

        // Вычислить текущую минуту в часе
        minute = (int) (totalMinutes % 60);

        // Вычислить количество часов
        int totalHours = (int) (totalMinutes / 60);

        // Вычислить текущий час
        hour = (int) (totalHours % 24);
    }
}
