package com.dmdev.collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsAndIterators {

    public static void main(String[] args) {
        List<String> words = List.of("карандаш", "тетрадка", "тетрадка", "резинка", "линейка");

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        for (String i : words){
            System.out.println(i);
        }

        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String i = it.next();
            System.out.println(i);
        }

        Set<String> words2 = Set.of("карандаш", "тетрадка", "тетрадка", "резинка", "линейка");

        for (String i : words2){
            System.out.println(i);
        }

        Iterator<String> it2 = words2.iterator();
        while (it2.hasNext()) {
            String i = it2.next();
            System.out.println(i);
        }
    }
}
