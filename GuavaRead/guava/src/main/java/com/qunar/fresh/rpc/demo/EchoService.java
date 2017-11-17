package com.qunar.fresh.rpc.demo;

/**
 * @version 1.0.0 @author junhua.han @date 2017-10-18 @time 上午12:17 <br>
 */
public interface EchoService {
    /**
     * echo方法
     * @param ping string
     * @return string
     */
    String echo(String ping);
}
