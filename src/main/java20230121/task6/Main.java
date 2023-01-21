package main.java20230121.task6;

public class Main {

    public static void main(String[] args) {
        SomeClassWithMethods s = new SomeClassWithMethods();
        LoggingService.log(s, "foo");
        s.foo(1);
        LoggingService.log(s, "bar");
        s.bar(2);
        LoggingService.log(s, "baz");
        s.baz(3);
    }
}
