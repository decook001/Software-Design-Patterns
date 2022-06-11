package com.company;

public class Director {
    Builder builder;

    void setBuilder(Builder b)
    {
        builder=b;
    }

    void constructSportsCar()
    {
        builder.reset();
        builder.setEngine("turbo");
        builder.setGPS(true);
        builder.setSeat(6);
        builder.setTyre(4);

    }

    void constructSUV()
    {
        builder.reset();
        builder.setEngine("diesel");
        builder.setGPS(false);
        builder.setSeat(2);
        builder.setTyre(6);
    }

    void createManual()
    {
        builder.reset();
        builder.setEngine("diesel");
        builder.setGPS(false);
        builder.setSeat(2);
        builder.setTyre(6);

    }
}
