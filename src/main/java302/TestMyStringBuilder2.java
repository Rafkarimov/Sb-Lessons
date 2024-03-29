package main.java302;
/*
������� �21
Java-���������� ������������� ����� StringBuilder. ������������ ����������� ���������� ��������� �������
(�������� ����� ����� MyStringBuilder2):

public MyStringBuilder2();
public MyStringBuilder2(char[] chars);
public MyStringBuilder2(String s);
public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
public MyStringBuilder2 reverse();
public MyStringBuilder2 substring(int begin);
public MyStringBuilder2 toUpperCase();
public String toString();
 */
public class TestMyStringBuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 s1 =
                new MyStringBuilder2(new char[]{'a', 'b', 'c', 'd', 'p'});
        MyStringBuilder2 s2 = new MyStringBuilder2("xyz");

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println(s1.insert(3, s2).toString());
        System.out.println(s1.reverse().toString());
        System.out.println(s1.substring(2).toString());
        System.out.println(s1.toUpperCase().toString());
    }
}

class MyStringBuilder2 {
    private int size = 0;
    private int capacity = 0;
    private char[] buffer;

    public MyStringBuilder2() {
    }

    public MyStringBuilder2(char[] chars) {
        buffer = new char[chars.length];
        size = capacity = chars.length;
        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    public MyStringBuilder2(String s) {
        capacity = size = s.length();
        buffer = new char[capacity];

        for (int i = 0; i < s.length(); i++)
            buffer[i] = s.charAt(i);
    }

    private void increaseCapacity(int newCapacity) {
        char[] temp = new char[newCapacity];
        System.arraycopy(buffer, 0, temp, 0, size);
        capacity = newCapacity;
        buffer = temp;
    }

    public int length() {
        return size;
    }

    public MyStringBuilder2 substring(int begin, int end) {
        char[] result = new char[end - begin];
        for (int i = 0; i < result.length; i++)
            result[i] = buffer[begin + i];

        return new MyStringBuilder2(result);
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        if (capacity < size + s.length()) {
            increaseCapacity(2 * (size + s.length()));
        }

        String temp = s.toString();
        for (int i = 0; i < temp.length(); i++)
            buffer[size - 1 + temp.length() - i] = buffer[size - 1 - i];

        for (int i = 0; i < temp.length() ; i++)
            buffer[i + offset] = temp.charAt(i);

        size += temp.length();

        return this;
    }

    public MyStringBuilder2 reverse() {
        for (int i = 0; i < size / 2; i++) {
            char temp = buffer[i];
            buffer[i] = buffer[size - 1 - i];
            buffer[size - 1 - i] = temp;
        }

        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        return substring(begin, size);
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < size; i++)
            buffer[i] = Character.toUpperCase(buffer[i]);

        return this;
    }

    @Override
    public String toString() {
        char[] temp = new char[size];
        for (int i = 0; i < size; i++)
            temp[i] = buffer[i];

        return new String(temp);
    }
}