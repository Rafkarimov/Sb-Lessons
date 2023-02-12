package homestudy.stream.unaryoperator;

import java.util.function.Function;

public class ApplicationFunctionUnaryOperator {
    public static void main(String[] args) {

        Function<Integer, Integer> test = (Integer digit) -> {
            //  UnaryOperator<Integer, Integer> test = (Integer digit) -> тоже самое написание наследует от Function
            return digit * 2;
        }; //интеджер преобразуется в интеджер

        System.out.println("result=" + test.apply(20));

    }
}
