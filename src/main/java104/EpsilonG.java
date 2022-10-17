package main.java104;

public class EpsilonG {
    public static void main(String[] args) {
        final double EPSILON = 1E-14;
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        if (Math.abs(x - 0.5) < EPSILON)
            System.out.println(x + " приблизительно равен 0.5.");
    }
}
