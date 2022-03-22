package com.taehyeon.chap05;

import java.util.Arrays;
import java.util.List;

public class DistinctStreamEx01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);

        numbers.stream()
                .filter(x->x % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}
