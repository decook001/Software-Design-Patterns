package com.company;

public abstract class Shape {
    int X,Y;
    String color;

    Shape(){}

    Shape(Shape source)
    {
        X=source.X;
        Y=source.Y;
        color=source.color;
    }

    abstract Shape cloneIt();



}
