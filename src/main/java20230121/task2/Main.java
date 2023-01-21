package main.java20230121.task2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    //Вывести все поля класса, их модификаторы и типы.

    public static void main(String[] args) {
        Class<Task> taskClass = Task.class;
        Task task = new Task();
        task.i = 54;

        for (Field field : taskClass.getDeclaredFields()) {
            int mods = field.getModifiers();
            if (Modifier.isPublic(mods)) System.out.print("public ");
            if (Modifier.isPrivate(mods)) {
                System.out.print("private ");
                field.setAccessible(true);
            }
            if (Modifier.isProtected(mods)) System.out.print("protected ");
            if (Modifier.isFinal(mods)) System.out.print("final ");
            if (Modifier.isStatic(mods)) System.out.print("static ");
            try {
                System.out.println(field.getType().getSimpleName() + " " + field.getName() + " = " + field.get(task));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}

