package com.taehyeon.chap05;

import com.taehyeon.chap04.Dish;

import java.util.Optional;

import static com.taehyeon.chap04.Dish.menu;

public class FindStreamEx01 {
    public static void main(String[] args) {
        if(isVegetarianFriendlyMenu()){
            System.out.println("Vegetarian friendly");
        }

        System.out.println(isHealthMenu());
        System.out.println(isHealthyMenu2());

        Optional<Dish> dish = findVegetarianDish();


        // 만약 존재한다면 ifPresent()
        dish.ifPresent(d-> System.out.println(d.getName()));
    }

    private static boolean isVegetarianFriendlyMenu(){
        return menu.stream().anyMatch(Dish::isVegetarian);
    }

    private static boolean isHealthMenu(){
        return menu.stream().anyMatch(c -> c.getCalories() < 1000);
    }

    private static boolean isHealthyMenu2(){
        return menu.stream().noneMatch(d -> d.getCalories() >= 1000);
    }

    private static Optional<Dish> findVegetarianDish(){
        return menu.stream().filter(Dish::isVegetarian).findAny();
    }
}
