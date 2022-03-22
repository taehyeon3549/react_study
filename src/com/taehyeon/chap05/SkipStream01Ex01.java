package com.taehyeon.chap05;

import com.taehyeon.chap04.Dish;

import java.util.List;
import java.util.stream.Collectors;

import static com.taehyeon.chap04.Dish.menu;

public class SkipStream01Ex01 {
    public static void main(String[] args) {
        List<Dish> dishes = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());

        dishes.stream().forEach(System.out::println);
    }
}
