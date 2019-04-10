package com.groupqal.model;

public abstract class Shape implements Comparable<Shape> {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": color= " + color;
    }

    public String getColor() {
        return color;
    }

    public double calcArea(){

        return  0.0;
    }
    @Override
    public int compareTo(Shape anyShape){
        return color.compareTo(anyShape.color);
    }
}
