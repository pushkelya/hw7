package com.groupqal.model;

import com.groupqal.model.Shape;


public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": \ncolor = " + this.getColor() +
                "\nradius = " + radius;
    }

    @Override
    public double calcArea(){

        return  Math.PI * Math.pow(radius, 2);
    }
}
