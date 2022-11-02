package main.dop.if01;

public class Test01 {
    public static void main(String[] args) {

        String str1 = "GFG";
        String str2 = "GeeksforGeeks";
        String str = String.format(
                "My Company name"
                        + " is: s%2$s%n, %1$s and %2$s",
                str1, str2);

        // Print and display the formatted string
        System.out.println(str);
    }
}
