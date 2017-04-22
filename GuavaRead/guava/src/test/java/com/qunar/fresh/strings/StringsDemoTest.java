package com.qunar.fresh.strings;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Strings;

/**
 * Created by junhuahan on 16-7-19. junhua.han@qunar.com
 */
public class StringsDemoTest {
    private final static Logger logger = LoggerFactory.getLogger(StringsDemoTest.class);

    @Test
    public void nullAndEmpty() {
        String a = "";
        logger.info("" + Strings.emptyToNull(a));
    }
}