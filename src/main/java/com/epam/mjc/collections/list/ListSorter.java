package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        System.out.println(sourceList);
        if (sourceList.isEmpty()) {
            return;
        }
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    public int parser(String n) {
        int i = Integer.parseInt(n);
        return (int) Math.pow(5 * i, 2) + 3;
    }

    @Override
    public int compare(String a, String b) {
        if (parser(a) == parser(b)) {
            return a.compareTo(b);
        }
        return parser(a) - parser(b);
    }
}