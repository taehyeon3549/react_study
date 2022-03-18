package com.taehyeon.chap03;

import java.util.function.Function;

public class Function01 {
    public static void main(String[] args) {
        Function<String, Integer> f = (s -> Integer.parseInt(s, 16));       // s를 16진수로
        Function<Integer, String> g = (i -> Integer.toBinaryString(i));     // 2진 문자열로 변환

        System.out.println(f.apply("10"));
        System.out.println(g.apply(10));
    }
}
