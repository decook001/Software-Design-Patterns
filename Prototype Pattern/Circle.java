package com.company;

public class Circle extends Shape {

    double radius;

    Circle(double rad)
    {
        radius=rad;
    }

    Circle(Circle source)
    {
        super(source);
        radius=source.radius;
    }

    @Override
    Shape cloneIt()
    {
        return new Circle(this);
    }
}