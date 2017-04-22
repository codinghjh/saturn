package com.quanr.fresh.adapter.objectadapter;

import com.quanr.fresh.adapter.Adaptee;
import com.quanr.fresh.adapter.Target;

/**
 * Created by hanju on 2016/8/9.
 * junhua.han@qunar.com
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;
    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
