package main.java20230121.task6;

public class SomeClassWithMethods {

    @ToBeLogged(logLevel = Logger.DEBUG)
    public void foo(int a) {
        System.out.println("foo!" + a);
    }

    @ToBeLogged
    public void bar(int b) {
        System.out.println("bar! " + b);
    }

    @ToBeLogged(logLevel = Logger.ERROR)
    public void baz(int c) {
        System.out.println("baz! " + c);
    }
}

