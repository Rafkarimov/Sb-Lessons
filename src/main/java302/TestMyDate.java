package main.java302;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 ������� �10: ����� MyDate
 �������� ����� � ������ MyDate ��� ������������� ����. ����� MyDate ������ ���������:

 ���� ������ year, month � day, ������� ������������ ����. ���� month ������ ���� �������� �� �����, �.�. 0 �
 ��� ������, 1 � ��� ������� � �.�.
 �������������� �����������, ������� ������� ������ ���� MyDate ��� ������� ����.
 �����������, ������� ������� ������ ���� MyDate � ��������� �������� � �������������, ��������� � 00:00,
 1 ������ 1970 �.
 �����������, ������� ������� ������ ���� MyDate � ���������� �����, ������� � ����.
 ��� getter-������ ��� ����� ������ year, month � day, ��������������.
 ����� � ������ setDate(long elapsedTime), ������� ����������� ����� ���� �������, ��������� ��������� �����.
 ��������� UML-��������� ������ MyDate, � ����� ���������� ���� �����. �������� ������ ����� ������ � ���������,
 ������� ������� ��� ������� ���� MyDate (� ������� new MyDate() � new MyDate(34355555133101L)) � ����������
 �� ���, ����� � ����.

 (���������: ������ ��� ������������ �������� ���, ����� � ���� �� ���������� �������. ��������, ���� ���������
 ����� ���������� 561555550000 �����������, �� ��� ����� 1987, ����� ����� 9, � ���� ����� 18. ��� ���������
 ����������� ����� ������������ ����� GregorianCalendar, ��������� � ���������� ��������. ����� 2� ����� �����.)
 */
public class TestMyDate {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.out.println("���: " + date.getYear());
        System.out.println("�����: " + date.getMonth());
        System.out.println("����: " + date.getDay());

        date.setDate(561555550000L);
        System.out.println("���: " + date.getYear());
        System.out.println("�����: " + date.getMonth());
        System.out.println("����: " + date.getDay());

        date = new MyDate(561555550000L);
        System.out.println("���: " + date.getYear());
        System.out.println("�����: " + date.getMonth());
        System.out.println("����: " + date.getDay());
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    MyDate() {
        setDate(new GregorianCalendar().getTimeInMillis());
    }

    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        // ����� ���, ����� � ���� �� ����. �� ������ ���� ���, ����� �������� ���������� ������ get()
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH)+1;
        day = date.get(Calendar.DAY_OF_MONTH);
    }
}
