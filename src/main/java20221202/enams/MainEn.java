package main.java20221202.enams;

public class MainEn {
    public static void main(String[] args) {
        //ENUM CALLS
        String str = "среда";
        System.out.println("Порядковый номер дня недели" + str + " = " + WeekDays.ofName(str).dayNumber);
        int number = 1;
        System.out.println("Название дня недели " + number + " = " + WeekDays.ofNumbers(number).dayOfWeek);
    }
}
