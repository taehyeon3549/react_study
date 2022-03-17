package com.taehyeon.chap02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda06 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

        // 기존 개발 방식의 sort 구현
//        Collections.sort(list, compare(s1, s2) -> { return s2.compareTo(s1); });

        // 람다식 대체하여 구현
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
    }
}
