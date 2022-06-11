package com.company;

public class Radio implements Device {
    private Boolean IsOn=false;
    private int Volume=0;
    private int Channel=0;

    @Override
    public Boolean isOn() {
        return IsOn;
    }

    @Override
    public void setOn() {
        IsOn=true;
    }

    @Override
    public void setOff() {
        IsOn=false;
    }

    @Override
    public int getVolume() {
        return Volume;
    }

    @Override
    public void setVolume(int volume) {
        Volume=volume;
    }

    @Override
    public int getChannel() {
        return Channel;
    }

    @Override
    public void setChannel(int channel) {
        Channel=channel;
    }

}
