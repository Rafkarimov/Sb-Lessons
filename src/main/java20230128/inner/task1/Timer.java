package main.java20230128.inner.task1;

import java.sql.Time;

public class Timer {
    private long timeNanoseconds = 0;

    public void measureTime(Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        timeNanoseconds += System.nanoTime() - startTime;
    }

    public long getTimeNanoseconds() {
        return timeNanoseconds;
    }
}

//353693300
