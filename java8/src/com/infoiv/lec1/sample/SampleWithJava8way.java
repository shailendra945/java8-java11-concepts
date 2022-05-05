package com.infoiv.lec1.sample;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class SampleWithJava8way {

    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
                new Apple("green",150),
                new Apple("yellow",120),
                new Apple("red",130),
                new Apple("orange",100)
        );
        //inventory.sort(comparing(Apple::getWeight));
        inventory.sort(comparing(Apple::getWeight).reversed());
        inventory.forEach(System.out::println);
    }
}
