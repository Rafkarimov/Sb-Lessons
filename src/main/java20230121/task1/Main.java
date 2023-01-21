package main.java20230121.task1;

import java.math.BigInteger;
import java.util.*;

//Получить все интерфейсы класса, включая интерфейсы от классов-родителей.
// Не включать интерфейсы родительских интерфейсов.
public class Main {
    public static void main(String[] args) {
        System.out.println(getAllInterfaces(MyChild.class));
    }

    public static List<Class<?>> getAllInterfaces(Class<?> clazz) {
        List<Class<?>> interfaces = new ArrayList<>();
        Class<?> currentClass = clazz;
        while (currentClass != null) {
            List<Class<?>> i = Arrays.asList(currentClass.getInterfaces());
            interfaces.addAll(i);
            for (Class<?> c : i) {
                interfaces.addAll(getAllInterfaces(c));
            }
            currentClass = currentClass.getSuperclass();
        }
        return interfaces;
    }
}


