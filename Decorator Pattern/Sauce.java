package com.company;

public class Sauce implements Decorator {
    private Decorator Source;

    public Sauce(Decorator source)
    {
        Source=source;
    }

    @Override
    public void write() {
        Source.write();
        System.out.printf("sauce ");
    }
}
