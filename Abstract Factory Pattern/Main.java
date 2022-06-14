package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        AbstractFactory factory;
        
        Scanner input=new Scanner( System.in );
        
        String fact=input.nextLine();
        String frn=input.nextLine();
        
        if( fact.equals("modern") )
        {
            factory=new ModernFactory();
        }
        else
        {
            factory=new VictorianFactory();
        }

        Furniture f1;
        
        if(frn.equals("chair") )
        {
            f1=factory.createChair();
        }
        else
        {
            f1=factory.createSofa();
        }

        f1.buy();


    }
}
