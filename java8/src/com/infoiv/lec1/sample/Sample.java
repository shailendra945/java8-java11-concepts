package com.infoiv.lec1.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample {

    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
                new Apple("green",150),
                new Apple("yellow",120),
                new Apple("red",130),
                new Apple("orange",100)
        );
        Collections.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        for ( Apple apple: inventory) {
            System.out.println(apple);
        }
    }
}
