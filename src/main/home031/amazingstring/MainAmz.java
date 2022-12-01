package main.home031.amazingstring;

public class MainAmz {
    public static void main(String[] args) {
        AmazingString amazingString = new AmazingString(new char[]{'1', '3', '4', '6'});
        System.out.println(amazingString.getSymbolByIndex(2));

//        AmazingString amazingString1 = new AmazingString(new char[]{'э', 'л', 'е', 'к', 'т', 'р', 'о', 'м', 'а', 'г',
//                'и', 'с', 'т', 'р', 'а', 'л', 'ь'});
//        System.out.println(amazingString1.containsSubstring(new char[]{'м', 'а', 'г', 'и', 'с', 'т', 'р', 'а', 'л',
//        'ь'}));
        AmazingString amazingString1 = new AmazingString(new char[]{'v', 'e', 'r', 'y', 'g', 'o', 'o', 'd', 'i', 'a', 'm'});
        System.out.println(amazingString1.containsSubstring(new char[]{'v', 'e', 'r', 'y', 'g', 'o', 'o', 'd', 'i', 'a', 'a', 'm'}));

        //удаление
        AmazingString amazingString2 = new AmazingString(new char[]{'\t', 'v', 'e', 'r', 'y', '\n', 'g', 'o', 'o', 'd', 'i', 'a', 'm'});
        amazingString2.printString();
        System.out.println("--------------------------");
        amazingString2.deleteSpace();
        amazingString2.printString();
    }
}
