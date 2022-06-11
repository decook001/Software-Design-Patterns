package com.company;

public interface Device {

    Boolean isOn();
    void setOn();
    void setOff();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}
