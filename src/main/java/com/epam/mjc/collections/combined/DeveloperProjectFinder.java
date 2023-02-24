package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> map : projects.entrySet()) {
            Set<String> set = map.getValue();
            if (set.contains(developer)) {
                list.add(map.getKey());
            }
        }

        return list;
    }
}
