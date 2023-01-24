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
        Class<ClassIsLike> likeClass = ClassIsLike.class;
        if (!likeClass.isAnnotationPresent(IsLike.class)) return;
        IsLike isLike = likeClass.getAnnotation(IsLike.class);
        System.out.println(isLike.count());
    }
}
