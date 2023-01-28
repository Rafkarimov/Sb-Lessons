package main.home043;

import main.home043.IsLike.ClassIsLike;
import main.home043.IsLike.IsLike;

/*
Написать метод, который рефлексивно проверит наличие аннотации @IsLike на
любом переданном классе и выведет значение, хранящееся в аннотации, на
экран.
 */
public class Task02 {
    public static void main(String[] args) {
        ClassIsLike target = new ClassIsLike();
        Class<?> targetClass = target.getClass();
        if (!targetClass.isAnnotationPresent(IsLike.class)) {
            System.out.println("Аннотации нет!");
        } else {
            System.out.println("Аннотация есть!");
        }
        IsLike isLike = targetClass.getAnnotation(IsLike.class);
        System.out.println(isLike.count());
    }
}
