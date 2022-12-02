package main.java20221202;

public class VariableLength {
    static int sum(int... numbers) { // тоже самое что и static int sum(int[] numbers)
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            res += numbers[i];
        }
        return res;
    }

    static boolean findChar(char ch, String... strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(findChar('a', "python", "java"));
        System.out.println(findChar('a', "python", "go"));

        System.out.println(String.format("This is digit %d", 123)); // %d что дальше придет число на вход, 123
        // на место %d
        System.out.println(String.format("This is digit %d. This is String %s", 123, "hi")); // %d - 123, %s - "hi"
    }
}
