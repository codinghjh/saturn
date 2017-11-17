package com.qunar.fresh.rpc.demo.impl;

import com.qunar.fresh.rpc.demo.EchoService;

/**
 * @version 1.0.0 @author junhua.han @date 2017-10-18 @time 上午12:20 <br>
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String ping) {
        return ping != null ? ping + " --> i am ok. " : "i am ok. ";
    }
}
