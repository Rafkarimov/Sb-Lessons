package main.java302;
/*
������� �19
����� split() ������ String ���������� ������ �����, ������� �������� ���������, ���������� �������������.
������ ���� ����������� �� ������������. ���������� ��������� ����� ����� split(), ������� ���������� ������ �����,
���������� ���������, ���������� ������������ �������������, ������� ���� �����������.

public static String[] split(String s, String regex)
��������, split("ab#12#453", "#") ���������� ab, #, 12, # � 453 � ������� �����, � split("a?b?gf#e", "[?#]")
���������� a, ?, b, ?, gf, # � e � ������� �����.
 */
public class TestString {
    public static void main(String[] args) {
        //String[] tokens = split("ab12gf45e777", "\\d+");

        // String[] tokens = split("ab#12#453##", "#");
        String[] tokens = split("a?b?gf#e", "[?#]");
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
    }

    public static String[] split(String s, String regex) {
        String[] tokens = s.split(regex); // split without delimiters

        // newTokens ����� �������� �����������
        String[] newTokens = new String[2 * tokens.length - 1];

        String remainingString = null; // ����� ���������� �� s

        int size = 0; // ����������� ������� � s

        for (int i = 0; i < tokens.length; i++) {
            newTokens[2 * i] = tokens[i];

            size += newTokens[2 * i].length();

            remainingString = s.substring(size);

            if (i == tokens.length -1) break;

            int j = remainingString.indexOf(tokens[i + 1]);

            newTokens[2 * i + 1] = remainingString.substring(0, j);

            size += newTokens[2 * i + 1].length();
        }

        // ���������, ���� �� ����������� � ����� �������� ������
        if (remainingString != null && remainingString.length() > 0) {
            String[] result = new String[newTokens.length + 1];
            System.arraycopy(newTokens, 0, result, 0, newTokens.length);
            result[result.length - 1] = remainingString;
            return result;
        }
        else
            return newTokens;
    }
}
