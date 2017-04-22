package com.qunar.fresh.hashbasedtable;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Stopwatch;
import com.google.common.collect.HashBasedTable;

/**
 * Created by hanju on 2016/8/8. junhua.han@qunar.com
 */
public class HashBasedTableDemo {
    private static final Logger logger = LoggerFactory.getLogger(HashBasedTableDemo.class);

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createUnstarted();
        HashBasedTable<Integer, Integer, Integer> table = HashBasedTable.create();
        for (int i = 0; i < 1000000; i++) {
            table.put(i, i, i);
        }
        stopwatch.start();
        table.containsRow(800000);
        stopwatch.stop();
        logger.info("get row key cost:{}", stopwatch.elapsed(TimeUnit.MILLISECONDS));
        stopwatch.start();
        table.containsColumn(800000);
        stopwatch.stop();
        logger.info("get column key cost:{}", stopwatch.elapsed(TimeUnit.MILLISECONDS));
    }
}
