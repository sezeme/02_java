package com.sezeme.section01.generic;

public class GenericTest<T> {
    T value;
    public void setValue(T i) {
        this.value = i;
    }

    public T getValue() {
        return value;
    }
}
