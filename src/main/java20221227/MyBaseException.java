package main.java20221227;

public class MyBaseException extends RuntimeException {
    public MyBaseException(String message) {
        super(message);
        System.out.println(message);
    }
}
