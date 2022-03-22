package com.taehyeon.chap05;

import com.taehyeon.chap04.Dish;

import java.util.List;
import java.util.stream.Collectors;

import static com.taehyeon.chap04.Dish.menu;

public class MapStreamEx01 {
    public static void main(String[] args) {
        List<String> menuNameList = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        List<Integer> menusNameLen = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());


        menuNameList.stream().forEach(System.out::println);
        menusNameLen.stream().forEach(System.out::println);
    }
}
