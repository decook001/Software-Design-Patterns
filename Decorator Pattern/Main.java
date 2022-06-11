package com.company;

public class Main
{
    public static void main(String[] args) {
	// write your code here
        Decorator burger = new Meonese(new Sauce(new Burger()));

        burger.write();

    }
}
