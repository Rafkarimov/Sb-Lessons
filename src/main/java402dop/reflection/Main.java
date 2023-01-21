package main.java402dop.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ReflectionTest reflectionTest = new ReflectionTest();
        Field privateField = ReflectionTest.class.getDeclaredField("name2");
        // Set the accessibility as true
        privateField.setAccessible(true);
        // Store the value of private field in variable
        String nameValue = (String) privateField.get(reflectionTest);
        System.out.println(nameValue);

        Method privateMethod = ReflectionTest.class.getDeclaredMethod("printName");
        privateMethod.setAccessible(true);
        privateMethod.invoke(reflectionTest);
    }
}
