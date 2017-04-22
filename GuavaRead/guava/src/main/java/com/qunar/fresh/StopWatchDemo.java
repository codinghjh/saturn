package com.qunar.fresh;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by junhuahan on 16-7-28. junhua.han@qunar.com
 */
public class StopWatchDemo {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        System.out.println(stopwatch.isRunning());
        int k = 0;
        for (int i = 0; i < 10000; i++) {
            k++;
        }
        stopwatch.stop();
        System.out.println(stopwatch.isRunning());
        long nanos = stopwatch.elapsed(TimeUnit.NANOSECONDS);
        System.out.println(nanos);
    }

    public void testTime() {
        long startTime = System.currentTimeMillis();
        int k = 0;
        for (int i = 0; i < 10000; i++) {
            k++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
