package com.infoiv.lec1.sample;

public class Apple {
    private final String color;
    private final Integer weight;

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

}
