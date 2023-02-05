package main.java20230128.question;

import java.util.ArrayList;
import java.util.List;

/*
Как использовать метод remove без явного приведения типов, если хочу удалить конкретное число в следующем коде:
 */
public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);

        list.remove(100); // не работает (автоматически переключается с метода "boolean remove (Object o)"
        //на метод "E remove (int index считая 100 индексом

        list.remove("100"); //не удаляет
        list.remove((Integer) 100); // удаляет, но метод небезопасен, так как можно забыть сделать явное приведение
        // (Integer) и в итоге удалить не то объект.
    }
}
