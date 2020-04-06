package com.zjh.demo.datastructure;

/**
 * author     zhuojianhai
 * date       2020/4/4   20:47
 * description  类功能描述
 */
public class MyList<E> extends AbstractList<E> {
    /**
     * 所有的元素
     */
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    @Override
    public void clear() {
        for (int i=0;i<elements.length;i++){
            elements[i]=null;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }
}
