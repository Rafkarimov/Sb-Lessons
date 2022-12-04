package main.home031.dayweek;
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
public enum DayOfWeek {
    MONDAY((byte)1, "Monday"),
    TUESDAY((byte)2, "Tuesday"),
    WEDNESDAY((byte)3, "Wednesday"),
    THURSDAY((byte)4, "Thursday"),
    FRIDAY((byte)5, "Friday"),
    SATURDAY((byte)6, "Saturday"),
    SUNDAY((byte)7, "Sunday");

//    private static final DayOfWeek[] ALL = values(); // вернет все значения enum, чтоб их не прописывать с помощью value()

    public final byte dayNumber;

    public final String dayName;

    DayOfWeek(byte dayNumber, String dayName) {
        this.dayNumber = dayNumber;
        this.dayName = dayName;
    }

    public static DayOfWeek ofNumbers(int dayNumber) {
        for (int i = 0; i < values().length; i++) {
            DayOfWeek wd = values()[i];
            if (wd.dayNumber == dayNumber) {
                return wd;
            }
        }
        //Можем написать так
        //return null;
        throw new IllegalArgumentException("Неизвестное значение номера дня недели " + dayNumber);
    }

    //Возвращает номер дня недели по названию
    public static DayOfWeek ofName(String ofName) {
        for (int i = 0; i < values().length; i++) {
            DayOfWeek wd = values()[i];
            if (wd.dayName.equals(ofName)) {
                return wd;
            }
        }
        throw new IllegalArgumentException("Неизвестное значение названия дня недели " + ofName);
    }

    @Override
    public String toString() {
        return dayNumber + " " + dayName;
    }
}
