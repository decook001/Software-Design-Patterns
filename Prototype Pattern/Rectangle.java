package com.company;

public class Rectangle extends Shape {
    int height, width;

    Rectangle(int h, int w)
    {
        height=h;
        width=w;
    }

    @Override
    Shape cloneIt() {
        return new Rectangle(this);
    }

    Rectangle(Rectangle source)
    {
        super(source);
        height=source.height;
        width=source.width;
    }


}
