package com.taehyeon.chap04;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.lang.*;

public class Stream02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Stream<Integer> intStream = list.stream();
        Stream<String> stringStream = Stream.of(new String[]{"a", "b", "c", "d"});
        Stream<Double> ranStream = Stream.generate(Math::random);       // 메소드 레퍼런스
        IntStream intStream1 = new Random().ints(5);        // 난수 스트림


        /**
        intStream.forEach(s -> System.out.println(s));
         와
         intStream.forEach(System.out::println);

         은 동일
        */

        intStream.forEach(System.out::println);
        stringStream.forEach(System.out::println);
//        ranStream.forEach(System.out::println);     // 무한 loop
        intStream1.forEach(System.out::println);
    }
}
