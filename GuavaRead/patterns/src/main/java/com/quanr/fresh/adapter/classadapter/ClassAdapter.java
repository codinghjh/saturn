package com.quanr.fresh.adapter.classadapter;

import com.quanr.fresh.adapter.Adaptee;
import com.quanr.fresh.adapter.Target;

/**
 * Created by hanju on 2016/8/9.
 * junhua.han@qunar.com
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
