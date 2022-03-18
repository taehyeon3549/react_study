package com.taehyeon.chap04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream04 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,5,4,2);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        // 스트림은 데이터 소스로부터 데이터를 읽기만할 뿐 변경하지 않음
        System.out.println(list);
        System.out.println(sortedList);

        String[] words = new String[]{"aed", "bsed", "c"};

        Arrays.stream(words).forEach(System.out::println);     // 모든 요소를 화면에 출력

        int numOfStr = (int) Arrays.stream(words).count();
        System.out.println(numOfStr);
    }
}
