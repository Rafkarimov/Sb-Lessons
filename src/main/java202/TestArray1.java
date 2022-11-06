package main.java202;

public class TestArray1 {
    public static void main(String[] args) {
        double[] r = new double[10];

        for (int i = 0; i < r.length; i++) {
            r[i] = Math.random() * 100;
        }
    }
}
