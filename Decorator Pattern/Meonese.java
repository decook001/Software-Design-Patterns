package com.company;

public class Meonese implements Decorator {
    private Decorator Source;

    public Meonese(Decorator source)
    {
        Source=source;
    }

    @Override
    public void write() {
        Source.write();
        System.out.println("meonese");
    }
}
