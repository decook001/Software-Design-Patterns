package com.company;

public class CarBuilder implements Builder {

    Car car;
    @Override
    public void setEngine(String engine) {
        car.engine=engine;
    }

    @Override
    public void setTyre(int tyre) {
        car.tyre=tyre;
    }

    @Override
    public void reset() {
        car=new Car();
    }

    @Override
    public void setSeat(int seat) {
        car.seat=seat;
    }

    @Override
    public void setGPS(Boolean yes) {
        car.GPS=yes;
    }

    Car getProduct()
    {
        return car;
    }
}
