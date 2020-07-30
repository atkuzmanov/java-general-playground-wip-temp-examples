package com.example;

/*
  Reference: http://www.vogella.com/tutorials/JavaDatastructures/article.html
 */

import java.util.Arrays;

public class MyStackArray<E> {
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;
    private Object elements[];

    public MyStackArray() {
        elements = new Object[DEFAULT_SIZE];
    }

    public void push(E e) {
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        E e = (E) elements [--size];
        elements[size] = null;
        return e;
    }

    private void ensureCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
