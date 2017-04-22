package com.qunar.fresh.Forwarding;

import java.util.Iterator;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.ForwardingIterator;
import com.google.common.collect.ForwardingList;

/**
 * Created by hanju on 2016/8/19. junhua.han@qunar.com
 */
public class ForwardingListDemo<E> extends ForwardingList<E> {

    private final E defaultValue;
    private List<E> delegate;

    public ForwardingListDemo(E defaultValue, List<E> delegate) {
        this.defaultValue = defaultValue;
        this.delegate = delegate;
    }

    @Override
    protected List<E> delegate() {
        return this.delegate;
    }

    @Override
    public E get(int index) {
        E value = super.get(index);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    @Override
    public Iterator<E> iterator() {
        final Iterator<E> iterator = super.iterator();
        return new ForwardingIterator<E>() { // 装饰的Iterator
            @Override
            protected Iterator<E> delegate() {
                return iterator;
            }

            @Override
            public E next() {
                E value = super.next();
                return (value == null ? defaultValue : value);
            }
        };
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("List", "[" + Joiner.on(", ").join(this) + "]")
                .add("DefaultValue", this.defaultValue).toString();
    }

}
