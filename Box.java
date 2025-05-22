package com.dmdev.collections;

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printBox(Box<?> box){
        System.out.println(box.getItem());
    }

}
