package com.qunar.fresh.rpc.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @version 1.0.0 @author junhua.han @date 2017-10-18 @time 上午12:24 <br>
 */
public class RpcExporter {
    static Executor executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public static void exporter(String hostName, int port) throws Exception {
        ServerSocket server = new ServerSocket();
        server.bind(new InetSocketAddress(hostName, port));

        try {
            while (true) {
                executor.execute(new ExporterTask(server.accept()));
                System.out.println("executor new ");
            }
        } finally {
            server.close();
        }
    }

    private static class ExporterTask implements Runnable {
        Socket client = null;

        public ExporterTask(Socket client) {
            this.client = client;
        }


        @Override
        public void run() {
            ObjectInputStream input = null;
            ObjectOutputStream output = null;
            try {
                System.out.println("thread:"+Thread.currentThread().getId());
                input = new ObjectInputStream(client.getInputStream());
                String interfaceName = input.readUTF();
                System.out.println("read interface:"+interfaceName);
                Class<?> service = Class.forName(interfaceName);

                String methodName = input.readUTF();
                System.out.println("read method:"+ methodName);
                Class<?>[] parameterTypes = (Class<?>[]) input.readObject();
                System.out.println("read param:"+parameterTypes);
                Object[] arguments = (Object[]) input.readObject();
                System.out.println("read arguments:"+ arguments);

                Method method = service.getMethod(methodName, parameterTypes);
                Object result = method.invoke(service.newInstance(), arguments);
                System.out.println("invoke method:" + result.toString());
                output = new ObjectOutputStream(client.getOutputStream());
                output.writeObject(result);
                System.out.println("write output:");
                System.out.println("---------------");
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if(output != null){
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                if(input != null){
                    try {
                        input.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if(client != null){
                    try {
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
