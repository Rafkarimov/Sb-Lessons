package main.home043.task04;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
Написать метод, который с помощью рефлексии получит все интерфейсы
класса, включая интерфейсы от классов-родителей и интерфейсов-родителей.
 */
public class Task04 {
    public static void main(String[] args) {
        Class<?>[] classBInterfaces = ClassB.class.getInterfaces();
        for (Class<?> c : classBInterfaces) {
            System.out.println(c.getName());
            for (Class<?> i : c.getInterfaces()) {
                System.out.println(i.getName());
            }
        }
        System.out.println("----------------------------------");
        Class<?> superClass = ClassB.class.getSuperclass();
        Class<?>[] superClassInterfaces = superClass.getInterfaces();
        for (Class<?> c : superClassInterfaces) {
            System.out.println(c.getName());
            for (Class<?> i : c.getInterfaces()) {
                System.out.println(i.getName());
            }
        }
    }
}
