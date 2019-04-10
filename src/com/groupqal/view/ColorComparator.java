package com.groupqal.view;

import com.groupqal.model.Shape;

import  java.util.Comparator;

public class ColorComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2){
        Shape sh1 = (Shape)shape1;
        Shape sh2 = (Shape)shape2;
        return sh1.compareTo(sh2);
    }
}
