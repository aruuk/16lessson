package com.company;

public class Circle {

    private final double Pi=Math.PI;

    public Circle() {
    }

    public static void area(double radius){
        double area = Math.PI * (radius * radius);
        System.out.println("area of circle: " + area);
    }

    public static void circumference(double radius){ //длина окружности
        double circumference= Math.PI * 2*radius;
        System.out.println("Circumference lengths : " + circumference) ;
    }
    
}
