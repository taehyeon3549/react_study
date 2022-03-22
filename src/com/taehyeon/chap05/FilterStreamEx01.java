package com.taehyeon.chap05;

import com.taehyeon.chap04.Dish;
import static com.taehyeon.chap04.Dish.menu;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamEx01 {
    public static void main(String[] args) {

        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        vegetarianMenu.stream().forEach(System.out::println);
    }
}
