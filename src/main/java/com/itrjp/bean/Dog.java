package com.itrjp.bean;

public class Dog {
    private String color;
    private String name;

    public Dog() {
    }

    public Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
