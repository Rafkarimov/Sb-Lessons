package main.dop.if01;

public class StringBuilderTest {
    public static void main(String[] args) {
        var sb = new StringBuilder();
        var str = "";
        var num = "#".repeat(10);
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            str += i;


        }
        System.out.println(sb);
        System.out.println(str);
        num.repeat(10);
        System.out.println(num);
    }
}
