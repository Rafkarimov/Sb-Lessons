package main.java201;
/*
Иногда существует два или более возможных определений для вызова метода, но компилятор не может определить из них
наиболее подходящий. Это называется неоднозначным вызовом. Неоднозначный вызов приводит к ошибке компиляции.
Рассмотрим программу AmbiguousOverloading:
 */

public class AmbiguousOverloading {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }
    public static double max(double num1, double num2) { //меняем int на double
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, int num2) { // после этого этот метод стал более предпочтительным
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}