package com.company;

public class DigitalRemote extends Remote
{
    private int Volume;
    void muteVolume()
    {
        Volume=Device.getVolume();
        Device.setVolume(0);
    }

    void unmuteVolume()
    {
        Device.setVolume(Volume);
    }

}
