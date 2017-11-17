package com.qunar.fresh.rpc.demo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @version 1.0.0 @author junhua.han @date 2017-10-18 @time 上午12:44 <br>
 */
@SuppressWarnings("unchecked")
public class RpcImporter<S> {
    public S importer(final Class<?> serviceClass, final InetSocketAddress address){
        return (S) Proxy.newProxyInstance(serviceClass.getClassLoader(), new Class<?>[]{serviceClass.getInterfaces()[0]}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = null;
                ObjectOutputStream output = null;
                ObjectInputStream input = null;
                try {
                    socket = new Socket();
                    socket.connect(address);
                    System.out.println("importer connect");
                    output = new ObjectOutputStream(socket.getOutputStream());
                    output.writeUTF(serviceClass.getName());
                    System.out.println("importer write interface");
                    output.writeUTF(method.getName());
                    System.out.println("importer write method");
                    output.writeObject(method.getParameterTypes());
                    System.out.println("importer write param");
                    output.writeObject(args);
                    System.out.println("importer write args");
                    input = new ObjectInputStream(socket.getInputStream());
                    System.out.println("importer get input result");
                    return input.readObject();
                }finally {
                    if(socket != null){
                        socket.close();
                    }
                    if(output != null){
                        output.close();
                    }
                    if(input!= null){
                        input.close();
                    }
                }
            }
        });
    }
}
