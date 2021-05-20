package ru.vtb.learning.exercise4;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        String[] source = new String[]{
                "A", "B", "C", "D", "E", "B", "C", "D", "E", "B", "E"
                , "B", "E", "B", "E", "B", "E"
        };


        HashMap<String, Integer> map = new HashMap<>();
        for (String item : source) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        System.out.println(map);
    }
}
