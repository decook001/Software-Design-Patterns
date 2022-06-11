package com.company;

public class Main
{
    public static void main(String[] args) {
	// write your code here
        Application app=new Application();
        Shape[] re=app.copy();
        for(int i=0; i< re.length; i++)
        {
            System.out.println("aha");
        }
    }
}
