package main.java302;
/*
«адание є19
ћетод split() класса String возвращает массив строк, который содержит подстроки, отделенные разделител€ми.
ќднако сами разделители не возвращаютс€. –еализуйте следующий новый метод split(), который возвращает массив строк,
содержащий подстроки, отделенные совпадающими разделител€ми, включа€ сами разделители.

public static String[] split(String s, String regex)
Ќапример, split("ab#12#453", "#") возвращает ab, #, 12, # и 453 в массиве строк, а split("a?b?gf#e", "[?#]")
возвращает a, ?, b, ?, gf, # и e в массиве строк.
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

        // newTokens будет включать разделители
        String[] newTokens = new String[2 * tokens.length - 1];

        String remainingString = null; // будет подстрокой из s

        int size = 0; // отслеживает позицию в s

        for (int i = 0; i < tokens.length; i++) {
            newTokens[2 * i] = tokens[i];

            size += newTokens[2 * i].length();

            remainingString = s.substring(size);

            if (i == tokens.length -1) break;

            int j = remainingString.indexOf(tokens[i + 1]);

            newTokens[2 * i + 1] = remainingString.substring(0, j);

            size += newTokens[2 * i + 1].length();
        }

        // ѕроверить, есть ли разделитель в конце исходной строки
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
