package com.company;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg Peg;
    SquarePegAdapter(SquarePeg peg) {
        Peg=peg;
    }

    @Override
    double getRadius()
    {
        return Peg.getWidth()/ Math.sqrt(2);
    }
}
