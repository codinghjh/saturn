package com.qunar.fresh.java8.lambada;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @version 1.0.0 @author junhua.han @date 2017-11-27 @time 下午10:16 <br>
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
