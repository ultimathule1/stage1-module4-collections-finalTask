package com.epam.mjc.collections.combined;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("five", 4);
        map.put("ten", 10);
        Map<Integer, Set<String>> map2 = createMap(map);
        for (Map.Entry<Integer, Set<String>> tempmap : map2.entrySet()) {
            System.out.println("Key: " + tempmap.getKey());
            System.out.println("Values: ");
            for (String myInt : tempmap.getValue()) {
                System.out.println(myInt);
            }
        }
    }
    public static Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> mainMap = new LinkedHashMap<>();
        int length;
        String value;
        for (Map.Entry<String, Integer> map : sourceMap.entrySet()) {
            length = map.getKey().length();
            value = map.getKey();
            Set<String> tempSet = new LinkedHashSet<>();
            tempSet.add(value);
            mainMap.put(length, tempSet);
        }

        return mainMap;
    }
}