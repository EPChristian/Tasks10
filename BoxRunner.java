package com.dmdev.collections;

public class BoxRunner {

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Настя");

        Box<Integer> intBox = new Box<>();
        intBox.setItem(23);

        stringBox.printBox(stringBox);
        intBox.printBox(intBox);

        Box rawBox = new Box();
        rawBox.setItem("Коля");
        rawBox.setItem(45);
        String name = (String) rawBox.getItem();
        System.out.println(name);
    }
}
