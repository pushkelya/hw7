package com.groupqal.model;

import com.groupqal.model.Shape;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": \ncolor = "
                + this.getColor() +
                "\na = " + a +
                "\nb = " + b +
                "\nc = " + c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * ((p - a) * (p -b) * (p - c)));
    }
}
