package main.java20221202.enams;

public enum WeekDays {
    MONDAY(1, "понедельник"),
    TUESDAY(2, "вторник"),
    WEDNESDAY(3, "среда"),
    THURSDAY(4, "четверг"),
    FRIDAY(5, "пятница"),
    SATURDAY(6, "суббота"),
    SUNDAY(7, "воскресенье");

    private static final WeekDays[] ALL = values(); // вернет все значения enum, чтоб их не прописывать с помощью value()
    public final int dayNumber;
    public final String dayOfWeek;

    WeekDays(int dayNumber, String dayOfWeek){
        this.dayNumber = dayNumber;
        this.dayOfWeek = dayOfWeek;
    }

    //Возвращает название дня недели по номеру
    public static WeekDays ofNumbers(int dayNumber){
        for (int i = 0; i < ALL.length; i++) {
            WeekDays wd = ALL[i];
            if (wd.dayNumber == dayNumber) {
                return wd;
            }
        }
        //Можем написать так
        //return null;
        throw new IllegalArgumentException("Неизвестное значение номера дня недели " + dayNumber);
    }

    //Возвращает номер дня недели по названию
    public static WeekDays ofName(String ofName) {
        for (int i = 0; i < ALL.length; i++) {
            WeekDays wd = ALL[i];
            if (wd.dayOfWeek.equals(ofName)) {
                return wd;
            }
        }
        throw new IllegalArgumentException("Неизвестное значение названия дня недели " + ofName);
    }
}
