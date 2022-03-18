package com.taehyeon.chap04;

import java.util.Arrays;
import java.util.List;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name , boolean vegetarian, int calories, Type type){
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName(){return this.name;}

    public boolean isVegetarian(){return this.vegetarian;}

    public int getCalories(){return this.calories;}

    public Type getType(){return this.type;}

    public enum Type {
        MEAT
        , FISH
        , OTHER
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static final List<Dish> menu = Arrays.asList(
            new Dish("돼지고지", false, 800, Type.MEAT)
            , new Dish("소고기", false, 700, Type.MEAT)
            , new Dish("닭고기", false, 400, Type.MEAT)
            , new Dish("감자 튀김", true, 530, Type.OTHER)
            , new Dish("밥", true, 350, Type.OTHER)
            , new Dish("계절 과일", true, 120, Type.OTHER)
            , new Dish("피자", false, 550, Type.OTHER)
            , new Dish("연어", false, 450, Type.FISH)
    );
}
