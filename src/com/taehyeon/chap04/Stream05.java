package com.taehyeon.chap04;

import java.util.stream.Stream;

public class Stream05 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("dd", "aaa", "CC", "cc", "b");

        int sum = stringStream.parallel()           // parallel 병렬 처리
                .mapToInt(s -> s.length()).sum();

        System.out.println(sum);
    }
}
