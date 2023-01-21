package main.java20230121.task5;

import main.java20230121.task4.ClassDescriptor;
import main.java20230121.task4.ClassWithDescriptor;


import java.util.Arrays;

//Создать класс, который по аннотации @ClassDescription из предыдущего задания выводит все описание на экран:
public class Main {
    public static void main(String[] args) {
        Class<ClassWithDescriptor> clazz = ClassWithDescriptor.class;
        if (!clazz.isAnnotationPresent(ClassDescriptor.class)) return;
        ClassDescriptor classDescriptor = clazz.getAnnotation(ClassDescriptor.class);
        System.out.println(classDescriptor.author());
        System.out.println(classDescriptor.date());
        System.out.println(classDescriptor.currentVersion());
        System.out.println(Arrays.asList(classDescriptor.reviewers()));
    }
}

