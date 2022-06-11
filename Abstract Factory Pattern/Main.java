package AbstractFactoryMethod;

public class Main {
    public static void main(String[] args)
    {
        AbstractFactory factory;
        int model=0;
        if(model==1)
        {
            factory=new ModernFactory();
        }
        else
        {
            factory=new VictorianFactory();
        }

        int sect=2;
        Furniture f1;


        if(sect==0)
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
