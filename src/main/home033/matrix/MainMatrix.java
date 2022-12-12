package main.home033.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMatrix {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(i + j);
            }
        }
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (i > 0 && i % n == 0) {
                result = result.trim();
                result += "\n";
            }
            result += list.get(i) + " ";
        }
        System.out.println(result);
    }
}