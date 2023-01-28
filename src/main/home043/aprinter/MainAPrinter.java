package main.home043.aprinter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/*
Задача: с помощью рефлексии вызвать метод print() и обработать все
возможные ошибки (в качестве аргумента передавать любое подходящее
число). При “ловле” исключений выводить на экран краткое описание ошибки.
 */
public class MainAPrinter {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        try {
            Method aPrinterMethod = APrinter.class.getMethod("print", int.class);
            APrinter aPrinter = new APrinter();
            aPrinterMethod.invoke(aPrinter, 1112312312); //зачем проверять, если передается любое подходящее число.
        } catch (NoSuchMethodException ex) {
            System.out.println("No such method");
        } catch (IllegalArgumentException ex) {
            System.out.println("Incorrect arguments given"); // количество
        } catch (InvocationTargetException ex) {
            System.out.println("The method has thrown an exception");
        }
    }
}
