package com.taehyeon.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Predicate는 Type T 인자를 받고 boolean을 리턴하는 함수형 인터페이스
 * */

public class PredicateExample {
    public static <T> List<T> filter(List<T> list, Predicate<T> p){

        List<T> result = new ArrayList<>();

        for(T t : list){
            if(p.test(t)){
                result.add(t);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();


        List<String> listOfString = Arrays.asList(new String[]{"1","2", ""});

        List<String> nonEmpt = filter(listOfString, nonEmptyStringPredicate);

        System.out.println(nonEmpt.toString());
    }
}
