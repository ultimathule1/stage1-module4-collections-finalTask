package com.epam.mjc.collections.combined;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> mainMap = new LinkedHashMap<>();
        int length;
        String value;
        for (Map.Entry<String, Integer> map : sourceMap.entrySet()) {
            length = map.getKey().length();
            value = map.getKey();
            if (mainMap.containsKey(length)) {
                continue;
            }
            Set<String> tempSet = new LinkedHashSet<>();
            tempSet.add(value);
            //sourceMap.remove(value);
            for (Map.Entry<String, Integer> tempmap : sourceMap.entrySet()) {
                if (tempmap.getKey().length() == length) {
                    tempSet.add(tempmap.getKey());
                }
            }
            mainMap.put(length, tempSet);
        }
        return mainMap;
    }
}