package com.taehyeon.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Function은 1개의 인자(Type T)를 받고 1개의 객체(Type R)를 리턴하는 함수형 인터페이스
 * */
public class FunctionExample {
    public static <T, R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();

        for(T t : list){
            result.add(f.apply(t));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> l = map(Arrays.asList("lambdas", "in", "action")
                , (String s)->s.length()
        );

        System.out.println(l.toString());
    }
}
