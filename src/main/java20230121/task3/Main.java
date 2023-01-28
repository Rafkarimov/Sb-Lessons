package main.java20230121.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    int a;
    String b;
    public Main(int a, String b) throws RuntimeException, IllegalArgumentException {
        this.a = a;
        this.b = b;
    }

//    Сконструировать класс. То есть вызвать конструктор класса и обработать все возможные ошибки.

    public static void main(String[] args) {
        Class<Main> mainClass = Main.class;
        try {
            Constructor<Main> mainConstructor = mainClass.getDeclaredConstructor(int.class, String.class); //получить
            // доступ к конструктору родительского класса
            System.out.println(Arrays.asList(mainConstructor.getExceptionTypes()));
            Main main = mainConstructor.newInstance(12, "sdfijsd");
            System.out.println(main);
            System.out.println(main.a);
            System.out.println(main.b);
        } catch (NoSuchMethodException ex) {
            System.out.println("No such method");
        } catch (IllegalAccessException ex) {
            System.out.println("The method access modifiers forbid calling it");
        } catch (IllegalArgumentException ex) {
            System.out.println("Incorrect arguments given"); // количество
        } catch (InvocationTargetException ex) {
            System.out.println("The method has thrown an exception");
        } catch (InstantiationException ex) {
            System.out.println("Class is abstract");
        }
    }
}

