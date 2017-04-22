package com.qunar.fresh.objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Objects;

/**
 * Created by junhuahan on 16-7-15. junhua.han@qunar.com
 */
public class ObjectsDemo {
    private final static Logger logger = LoggerFactory.getLogger(ObjectsDemo.class);

    public static void main(String[] args) {
        logger.info(Objects.equal("a", "a") + "");
        logger.info(Objects.equal("a", null) + "");
        logger.info(Objects.equal(null, "a") + "");
        logger.info(Objects.equal(null, null) + "");
        ObjectsDemo objectsDemo = new ObjectsDemo();
        logger.info(Objects.toStringHelper(objectsDemo).add("x", 1).toString());
        Foo foo1 = new Foo();
        foo1.setName("this");
        foo1.setA(10);
        Foo foo = new Foo();
        foo.setA(10);
        foo.setName("this");
        logger.info(foo.compareTo(foo1) + "");

    }
}
