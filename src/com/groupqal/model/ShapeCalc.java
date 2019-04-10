package com.groupqal.model;

public class ShapeCalc {
    public double calcTotalArea(Shape[] shapes){
        double totalArea = 0;
        for(Shape elem : shapes){
            totalArea += elem.calcArea();
        }
        return totalArea;
    }
    public double circlesArea(Shape[] shapes){
        double circleArea = 0;
        for(int i = 0; i < shapes.length; i++){
            String className = shapes[i].getClass().getName();
            if(className.contains("Circle")){
                circleArea += shapes[i].calcArea();
            }
        }
        return  circleArea;
    }
    public double rectanglesArea(Shape[] shapes){
        double restangleArea = 0;
        for(int i = 0; i < shapes.length; i++){
            String className = shapes[i].getClass().getName();
            if(className.contains("Rectangle")){
                restangleArea += shapes[i].calcArea();
            }
        }
        return restangleArea;
    }
    public double trianglesArea(Shape[]shapes){
        double triangleArea = 0;
        for(int i = 0; i < shapes.length; i++){
            String className = shapes[i].getClass().getName();
            if(className.contains("Triangle")){
                triangleArea += shapes[i].calcArea();
            }
        }
        return triangleArea;
    }


}
