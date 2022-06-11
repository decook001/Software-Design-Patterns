package com.company;

public class Remote {
    Device Device;

    void setDevice(Device device)
    {
        Device=device;
    }

    void togglePower()
    {
        if(Device.isOn())Device.setOff();
        else Device.setOn();
    }

    void upVolume()
    {
        if(Device.getVolume()<100)Device.setVolume(Device.getVolume()+1);
    }

    void downVolume()
    {
        if(Device.getVolume()>0)Device.setVolume(Device.getVolume()-1);
    }

    void upChannel()
    {
        Device.setVolume( ( Device.getVolume()+1 ) % 101 );
    }

    void downChannel()
    {
        Device.setVolume( (Device.getVolume()-1+101) %101 );
    }


}
