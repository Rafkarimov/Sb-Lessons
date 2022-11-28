package main.java302;

/*
�������� ����� � ������ MyInteger, ������� ������ ���������:

���� ������ value ���� int, � ������� �������� ������������� ��������, �������������� ���� ��������.
�����������, ������� ������� ������ ���� MyInteger ��� ���������� �������� ���� int.
Getter-�����, ������� ���������� �������� ���� int.
������ isEven(), isOdd() � isPrime(), ������� ���������� �������� true, ���� �������� ���� int � ���� ������� ��������
������, �������� ��� ������� ��������������.
����������� ������ isEven(int), isOdd(int) � isPrime(int), ������� ���������� �������� true, ���� ��������� ��������
�������� ������, �������� ��� ������� ��������������.
����������� ������ isEven(MyInteger), isOdd(MyInteger) � isPrime(MyInteger), ������� ���������� �������� true,
���� ��������� �������� �������� ������, �������� ��� ������� ��������������.
������ equals(int) � equals(MyInteger), ������� ���������� �������� true, ���� �������� ���� int � ���� �������
��������� ���������� ��������.
����������� ����� parseInt(char[]), ������� ����������� ������ �������� �������� � �������� ���� int.
����������� ����� parseInt(String), ������� ����������� ������ � �������� ���� int.
��������� UML-��������� ������ MyInteger, � ����� ���������� ���� �����. �������� ������ ����� ������ � ���������,
������� ��������� ��� ������ ����� ������.
 */
public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 ������? " + n1.isEven());
        System.out.println("n1 �������? " + n1.isPrime());
        System.out.println("15 �������? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 ��������? " + n2.isOdd());
        System.out.println("45 ��������? " + MyInteger.isOdd(45));
        System.out.println("n1 ����� n2? " + n1.equals(n2));
        System.out.println("n1 ����� 5? " + n1.equals(5));
    }
}

class MyInteger {
    private int value;

    public int getValue() {
        return value;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(int num) {
        if ((num == 1) || (num == 2)) {
            return true;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime(MyInteger o) {
        return isPrime(o.getValue());
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isEven(MyInteger n) {
        return isEven(n.getValue());
    }

    public boolean equals(int anotherNum) {
        return value == anotherNum;
    }

    public boolean equals(MyInteger o) {
        return value == o.getValue();
    }

    public static int parseInt(char[] numbers) {
        // numbers ������� �� �������� ����.
        // ��������, ���� numbers ����� {'1', '2', '5'}, �� ������������ ��������
        // ������ ���� ������ 125. �������� ��������, ���
        // numbers[0] ����� '1'
        // numbers[1] ����� '2'
        // numbers[2] ����� '5'

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result * 10 + (numbers[i] - '0');
        }

        return result;
    }

    public static int parseInt(String s) {
        // s ������� �� �������� ����.
        // ��������, ���� s ����� "125", �� ������������ ��������
        // ������ ���� ������ 125.
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }

        return result;
    }
}

