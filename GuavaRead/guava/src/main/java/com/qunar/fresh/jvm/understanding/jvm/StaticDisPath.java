package com.qunar.fresh.jvm.understanding.jvm;

/**
 * @version 1.0.0 @author junhua.han @date 2017-11-01 @time 上午12:31 <br>
 */
public class StaticDisPath {

    static abstract class Human{}

    static class Man extends Human{}

    static class Women extends Human{}

    public void sayHello(Human guy){
        System.out.println("hello, guy!");
    }

    public void sayHello(Man guy){
        System.out.println("hello, gentlemen!");
    }

    public void sayHello(Women guy){
        System.out.println("hello, lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();

        StaticDisPath staticDisPath = new StaticDisPath();
        staticDisPath.sayHello(man);
        staticDisPath.sayHello(women);

        //
        staticDisPath.sayHello((Man) man);
        staticDisPath.sayHello((Women) women);
    }
}
