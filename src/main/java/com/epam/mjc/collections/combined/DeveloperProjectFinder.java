package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new LinkedList<>();
        for (Map.Entry<String, Set<String>> map : projects.entrySet()) {
            Set<String> set = map.getValue();
            if (set.contains(developer)) {
                list.add(map.getKey());
            }
        }

        return list;
    }
}
