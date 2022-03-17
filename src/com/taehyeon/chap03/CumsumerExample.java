package com.taehyeon.chap03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer는 1개의 Type T 인자를 받고 리턴 값이 없는 함수형 인터페이스
 * */
public class CumsumerExample {
    public static <T> void forEach(List<T> list, Consumer<T> c){
        for(T t: list){
            c.accept(t);
        }
    }

    public static void main(String[] args) {
        forEach(
                Arrays.asList(1,2,3,4,5)
                , (integer -> System.out.println(integer))
        );
    }
}
