package main.java202;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");

        }

    }
    public static void reverse(int[] list) {
    int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++) {
          newList[i] = list[list.length - 1 -i];

          list = newList;
        }
    }
}






