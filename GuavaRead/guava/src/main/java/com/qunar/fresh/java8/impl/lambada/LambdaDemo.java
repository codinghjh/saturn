package com.qunar.fresh.java8.impl.lambada;

import com.qunar.fresh.java8.BufferedReaderProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0.0 @author junhua.han @date 2017-11-24 @time 下午9:09 <br>
 */
public class LambdaDemo {
    private static final Logger logger = LoggerFactory.getLogger(LambdaDemo.class);


    public static void main(String[] args) throws IOException {

        String online = processFile(BufferedReader::readLine);
        String twoline = processFile((BufferedReader br) -> br.readLine()+ br.readLine());

        System.out.println(online);
        System.out.println(twoline);
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/GuavaRead/guava/src/main/resources/data.txt"))){
            return p.process(br);
        }
    }

}
