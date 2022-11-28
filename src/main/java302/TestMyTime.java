package main.java302;

/*
������� �8: ����� MyTime
�������� ����� MyTime ��� ������������� �������. ����� MyTime ������ ���������:

���� ������ hour, minute � second, ������� ������������ �����.
�������������� �����������, ������� ������� ������ ���� MyTime ��� �������� �������. (�������� ����� ������ �����
������� ������������ ������� �����.)
�����������, ������� ������� ������ ���� MyTime � ��������� �������� � �������������, ��������� � 00:00,
1 ������ 1970 �. (�������� ����� ������ ����� ������� ����� ������������ ��� �����.)
�����������, ������� ������� ������ ���� MyTime � ���������� ������, �������� � ���������.
��� getter-������ ��� ����� ������ hour, minute � second ��������������.
����� � ������ setTime(long elapseTime), ������� ����������� ������� ����� ����� � ������� ���������� �������.
��������, ���� ��������� ����� ����� 555550000 �������������, �� hour ����� 10, minute ����� 19, � second ����� 10.
��������� UML-��������� ������ MyTime, � ����� ���������� ���� �����. �������� ������ ����� ������ � ���������,
������� ������� ��� ������� ���� MyTime (� ������� new MyTime(), new MyTime(555550000) � new MyTime(5, 23, 55))
� ���������� ��������� �� ����� ������ hour, minute � second � ������� ����:������:�������.

(���������: ������ ��� ������������ �������� �������� hour, minute � second �� ���������� �������. ��� ���������������
������������ ������� ����� ����� ���� �������� � ������� ������ System.currentTimeMillis(), ��� ���� ��������
� ��������� ShowCurrentTime �� ����� ������� Java-�����������������. ����� ����� ����� GMT.)
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
        // ��������� ���������� ������, ��������� � 00:00, 1 ������ 1970 �.
        long totalSeconds = elapsedTime / 1000;

        // ��������� ������� ������� � ������ � ����
        second = (int) (totalSeconds % 60);

        // ��������� ���������� �����
        long totalMinutes = totalSeconds / 60;

        // ��������� ������� ������ � ����
        minute = (int) (totalMinutes % 60);

        // ��������� ���������� �����
        int totalHours = (int) (totalMinutes / 60);

        // ��������� ������� ���
        hour = (int) (totalHours % 24);
    }
}
