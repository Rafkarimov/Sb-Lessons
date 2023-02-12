package homestudy.spring;

public class AppSpring {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Can't find str in arguments");
        }
        String str = args[0];
        System.out.println(str);
//        System.out.println("Hello world");
    }
}
