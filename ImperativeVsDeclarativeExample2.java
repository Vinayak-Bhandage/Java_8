package com.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 6, 7, 5, 8, 8);

        /*
         * This is imperative style.
         */
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println(uniqueList);

        /*
         * This is declarative style.
         */
        List<Integer> uniqueList1 = integerList.stream().distinct().toList();
        System.out.println(uniqueList1);
    }
}
