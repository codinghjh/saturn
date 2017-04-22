package com.qunar.fresh.optional;


import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by junhuahan on 16-7-15. junhua.han@qunar.com
 */
public class OptionalDemo {
    private static final Logger logger = LoggerFactory.getLogger(OptionalDemo.class);
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(5);
        if (optional.isPresent())
            logger.info(optional.get() + "");
        Optional<Integer> absentOptional = Optional.absent();
        logger.info(absentOptional.orNull() + "");
        Integer integer = null;
        try {
            logger.info(Preconditions.checkNotNull(integer) + "");
        } catch (NullPointerException e) {
            logger.error("nullPointerException");
        }
    }
}
