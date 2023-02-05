package main.home044;

import java.util.ArrayList;
import java.util.List;

public class Task71 {
    public static void main(String[] args) {
        System.out.println(canBeEqualizedOrNot("cat", "cats"));
        System.out.println(canBeEqualizedOrNot("cat", "cut"));
        System.out.println(canBeEqualizedOrNot("cat", "nut"));
    }

    private static boolean canBeEqualizedOrNot(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }

        List<Character> list1 = s1.chars().mapToObj(c -> (char) c).toList();
        List<Character> list2 = s2.chars().mapToObj(c -> (char) c).toList();

        List<Character> diff1 = new ArrayList<>(list1);
        List<Character> diff2 = new ArrayList<>(list2);

        list1.forEach(diff2::remove);
        list2.forEach(diff1::remove);

        return diff1.size() <= 1 && diff2.size() <= 1;
    }

}
