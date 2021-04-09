package com.company;

public class CircleArea {

    public static void main (String[] args) {
        Circle myCircle = new Circle (5);
        System.out.println (myCircle.getArea ());
       // System.out.println (Math.PI);
    }
}

class Circle {

    private final double radius;

    Circle (double radius) {

        this.radius = radius;
    }

    double getArea () {
        double area = Math.PI * radius * radius;
        return area;
    }

}

