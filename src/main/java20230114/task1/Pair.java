package main.java20230114.task1;

//public class Pair <T extends String, V extends Number> {
//    public T first;
//    public V second;
//
//    @Override
//    public String toString() {
//        return "Pair{" +
//                "first=" + first +
//                ", second=" + second +
//                '}';
//    }
//}

public class Pair <T>{
    public T first;
    public T second;

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
