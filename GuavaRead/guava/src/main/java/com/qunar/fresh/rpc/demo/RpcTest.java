package com.qunar.fresh.rpc.demo;

import com.qunar.fresh.rpc.demo.impl.EchoServiceImpl;

import java.net.InetSocketAddress;

/**
 * @version 1.0.0 @author junhua.han @date 2017-10-18 @time 上午12:51 <br>
 */
@SuppressWarnings("unchecked")
public class RpcTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    RpcExporter.exporter("localhost", 8088);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        RpcImporter<EchoService> importer = new RpcImporter<>();
        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("localhost",8088));
        System.out.println(echo.echo("Aer you ok ?"));

    }
}
