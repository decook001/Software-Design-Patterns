package com.company;

public class RoundHole {

    private int Radius;

    RoundHole(int radius)
    {
        Radius=radius;
    }

    int getRadius()
    {
        return Radius;
    }

    Boolean fits(RoundPeg peg)
    {
        return Radius>=peg.getRadius();
    }

}
