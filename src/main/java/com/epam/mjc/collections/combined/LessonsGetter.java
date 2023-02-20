package com.epam.mjc.collections.combined;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessonsSet  = new LinkedHashSet<>();
        for (Map.Entry<String, List<String>> map : timetable.entrySet()) {
            lessonsSet.addAll(map.getValue());
        }

        return lessonsSet;
    }
}
