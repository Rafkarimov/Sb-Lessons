package main.stream.method;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class AppReplaceAll {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        UnaryOperator<String> lambda = (String s) -> {
            return s + "_" + s;
        };
        list.replaceAll(lambda); // изменить коллекцию

        System.out.println(list);
    }
}
