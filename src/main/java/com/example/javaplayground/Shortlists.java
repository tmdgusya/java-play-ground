package com.example.javaplayground;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shortlists {

    public static <T> List<T> sorted(
            List<T> sortedlist,
            Comparator<? super T> ordering
    ) {
        return sortedlist
                .stream()
                .sorted(ordering)
                .collect(Collectors.toUnmodifiableList());
    }

    public static <T> List<T> removeItemAt(
            List<T> shortlist,
            int index
    ) {
        return Stream.concat(
                shortlist.stream().limit(index),
                shortlist.stream().skip(index + 1)
        ).collect(Collectors.toUnmodifiableList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Fred", "Jim", "Sheila");
        List<String> sortedNames = Shortlists.sorted(names, String::compareToIgnoreCase);
        System.out.println(sortedNames);
        System.out.println(sortedNames.stream().limit(2).collect(Collectors.toList()));
        System.out.println(sortedNames.stream().skip(1).collect(Collectors.toList()));
        System.out.println(removeItemAt(sortedNames, 0));
    }
}