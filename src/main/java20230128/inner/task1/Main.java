package main.java20230128.inner.task1;

//создать таймер, который считает время выполнения метода, используя Runnable.

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
//        timer.measureTime(new Runnable() {
//            @Override
//            public void run() {
//                long sum = 0;
//                for (int i = 1; i <= 1_000_000_000; ++i) {
//                    sum += i;
//                }
//                System.out.println(sum);
//            }
//        });
        Runnable runnable = () -> {
            long sum = 0;
            for (int i = 1; i <= 2_000_000_000; ++i) {
                sum += i;
            }
            System.out.println(sum);
        };
        timer.measureTime(runnable);
        System.out.println(timer.getTimeNanoseconds());
        }
//        timer.measureTime(() -> {
//            long sum = 0;
//            for (int i = 1; i <= 1_000_000_000; ++i) {
//                sum += i;
//            }
//            System.out.println(sum);
//        });
//        System.out.println(timer.getTimeNanoseconds());
//    }
}
