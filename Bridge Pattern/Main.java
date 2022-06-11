package com.company;

public class Main
{
    public static void main(String[] args) {
	// write your code here

        SmartRemote remote=new SmartRemote();

        Tv tv=new Tv();

        remote.setDevice(tv);

        remote.goURL("youtube.com");


    }
}
