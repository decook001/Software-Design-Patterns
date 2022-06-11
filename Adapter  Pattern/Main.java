package com.company;

public class Main
{
    public static void main(String[] args) {
	// write your code here
        RoundHole hole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(8);
        SquarePeg squarePeg = new SquarePeg(6);
        SquarePegAdapter adapter  = new SquarePegAdapter(squarePeg);

        System.out.println(hole.fits(roundPeg));

        System.out.println(hole.fits(adapter));


    }
}
