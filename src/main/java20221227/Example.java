package main.java20221227;

public class Example {
    public static void main(String[] args) {
        try {
            throwIllegal();
            thowRun();
        } catch (IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    private static void thowRun() {
        throw new NullPointerException("runtime");
    }

    private static void throwIllegal() {
        throw new IllegalArgumentException("illegal");
    }
}
