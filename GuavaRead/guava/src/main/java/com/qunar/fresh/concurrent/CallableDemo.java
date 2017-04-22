package com.qunar.fresh.concurrent;

import java.util.concurrent.Callable;

/**
 * Version: 1.0.0 Date:2017-04-19 Time: 00:51 Author: junhua.han <br>
 */
public class CallableDemo implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }

    public  void main(String[] args) throws Exception {
        CallableDemo.this.call();
    }
}
