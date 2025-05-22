package com.dmdev.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

    public static void main(String[] args) {
        int size = 1_000_000;

        ArrayList<Integer> million = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            million.add(i);
        }

        LinkedList<Integer> million2 = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            million2.add(i);
        }

        ArrayList<Integer> millionForStart = new ArrayList<>(million);
        ArrayList<Integer> millionForMiddle = new ArrayList<>(million);

        LinkedList<Integer> million2ForStart = new LinkedList<>(million2);
        LinkedList<Integer> million2ForMiddle = new LinkedList<>(million2);

        long startArrayListForStart = System.nanoTime();
        millionForStart.add(0,44);
        long endArrayListForStart = System.nanoTime();
        System.out.println("ArrayList время вставки в начало: " + (endArrayListForStart - startArrayListForStart) / 1_000_000.0 + " ms");

        long startLinkedListForStart = System.nanoTime();
        million2ForStart.addFirst(44);
        long endLinkedListForStart = System.nanoTime();
        System.out.println("LinkedList время вставки в начало: " + (endLinkedListForStart - startLinkedListForStart) / 1_000_000.0 + " ms");
        System.out.println("Разница времени: " + ((endArrayListForStart - startArrayListForStart) - (endLinkedListForStart - startLinkedListForStart)) / 1_000_000.0 + " ms");

        int middle = size/2;

        long startArrayListForMiddle = System.nanoTime();
        millionForMiddle.add(middle, 43_345);
        long endArrayListForMiddle = System.nanoTime();
        System.out.println("ArrayList время вставки в середину: " + (endArrayListForMiddle - startArrayListForMiddle) / 1_000_000.0 + " ms");

        long startLinkedListForMiddle = System.nanoTime();
        million2ForMiddle.add(middle, 43_345);
        long endLinkedListForMiddle = System.nanoTime();
        System.out.println("LinkedList время вставки в середину: " + (endLinkedListForMiddle - startLinkedListForMiddle) / 1_000_000.0 + " ms");
        System.out.println("Разница времени: " + ((endArrayListForMiddle - startArrayListForMiddle) - (endLinkedListForMiddle - startLinkedListForMiddle)) / 1_000_000.0 + " ms");

    }
}
