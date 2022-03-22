package com.taehyeon.chap05;

import com.taehyeon.chap04.Dish;

import java.util.List;
import java.util.stream.Collectors;

import static com.taehyeon.chap04.Dish.menu;

public class LimitStreamEx01 {
    public static void main(String[] args) {
        List<Dish> numberList = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());

        numberList.stream().forEach(System.out::println);


    }
}
