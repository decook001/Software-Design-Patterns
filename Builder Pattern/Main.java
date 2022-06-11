package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Director director=new Director();

        CarBuilder builder=new CarBuilder();
        director.setBuilder(builder);

        director.constructSportsCar();
        Car car=builder.getProduct();

        director.constructSUV();
        Car car2=builder.getProduct();

        CarManualBuilder ManualBuilder = new CarManualBuilder();
        director.setBuilder(ManualBuilder);
        director.createManual();
        Manual manual=ManualBuilder.getProduct();
        
    }
}
