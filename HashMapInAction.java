package com.dmdev.collections;

import java.util.HashMap;

public class HashMapInAction {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Tom", 21);
        students.put(null, 19);
        students.put("Tom", 23);
        System.out.println(students.get("Tom"));
        System.out.println(students.get(null));
        System.out.println(students.get("Betty"));
    }
}
