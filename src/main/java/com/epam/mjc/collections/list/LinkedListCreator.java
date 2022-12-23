package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedListOffOddNumbers = new LinkedList<>();
        LinkedList<Integer> linkedListOffEvenNumbers = new LinkedList<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 0) {
                linkedListOffEvenNumbers.add(integer);
            }
            if (integer % 2 != 0) {
                linkedListOffOddNumbers.add(integer);
            }
        }
        Collections.reverse(linkedListOffOddNumbers);
        LinkedList<Integer> linkedListOffOddAndEvenNumbers = new LinkedList<>(linkedListOffOddNumbers);
        linkedListOffOddAndEvenNumbers.addAll(linkedListOffOddAndEvenNumbers.size(), linkedListOffEvenNumbers);
        System.out.println(linkedListOffOddNumbers);
        return linkedListOffOddAndEvenNumbers;
    }
}
