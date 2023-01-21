package main.java20230121;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private String param1;
    public static final int PUBLIC           = 0x00000001;


    public static void main(String[] args) {
        try {
            System.out.println(Class.forName("java.lang.String"));
            Class<? extends String> clazz = "ddsf".getClass();
            Class<ArrayList> listClass = ArrayList.class;
            Class<main.java20230114.task9.Main.Phone> phoneClass = main.java20230114.task9.Main.Phone.class;
            String s = "  ";
            System.out.println(clazz.newInstance());
            System.out.println(clazz.isInstance(s));
            System.out.println(clazz.isInstance(5d));
            System.out.println(clazz.isInterface());
            System.out.println(phoneClass.getName());
            System.out.println(phoneClass.getSimpleName());
            System.out.println(phoneClass.getTypeName());
            System.out.println(phoneClass.getCanonicalName());
            System.out.println(phoneClass.getPackageName());
            System.out.println(phoneClass.getSuperclass());
            System.out.println(clazz.getSuperclass());
            for (Class c : phoneClass.getInterfaces()) {
                System.out.println(c);
            }
            System.out.println(phoneClass.getComponentType());
            System.out.println(phoneClass.getModifiers() + " "
                    + Modifier.isPublic(phoneClass.getModifiers()) + " "
                    + Modifier.isPrivate(phoneClass.getModifiers()));
            System.out.println(1 & PUBLIC);
            System.out.println(Object.class.getSuperclass());
            System.out.println(Arrays.asList(phoneClass.getDeclaredFields()));
            Arrays.asList(phoneClass.getDeclaredFields()).forEach(System.out::println);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

