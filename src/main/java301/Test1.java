package main.java301;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date) {
        date = null;
    }
}
