package homestudy.stream.method;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class AppSort {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("x33");
        list.add("v1");
        list.add("a");

        Comparator<String> comparator = (String lhs, String rhs) -> {

//            return lhs.compareTo(rhs); //сортировка в лексикографическом порядке
//            return -1 * lhs.compareTo(rhs); // сортировка в обратном порядке
            //по размеру строк
            int lhsSize = lhs.length();
            int rhsSize = rhs.length();

            if (lhsSize == rhsSize) {
                return 0;
            }
            if (lhsSize < rhsSize) {
                return -1;
            } else {
                return 1;
            }
        };

        list.sort(comparator);
        list.forEach((String s) -> {
            System.out.print(s);
            System.out.println(" ");
        }); // для вывода на экран
    }
}
