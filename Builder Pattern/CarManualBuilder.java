package com.company;

public class CarManualBuilder implements Builder {
    Manual manual;

    @Override
    public void setEngine(String engine) {
        manual.engine=engine;
    }

    @Override
    public void setTyre(int tyre) {
        manual.tyre=tyre;
    }

    @Override
    public void reset() {
        manual=new Manual();
    }

    @Override
    public void setSeat(int seat) {
        manual.seat=seat;
    }

    @Override
    public void setGPS(Boolean yes) {
        manual.GPS=yes;
    }

    Manual getProduct()
    {
        return manual;
    }
}
