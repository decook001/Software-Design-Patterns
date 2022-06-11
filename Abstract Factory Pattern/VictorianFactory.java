package AbstractFactoryMethod;

public class VictorianFactory extends AbstractFactory {
    @Override
    public Furniture createChair() {
        return new VictorianChair();
    }

    @Override
    public Furniture createSofa() {
        return new VictorianSofa();
    }
}


class VictorianSofa extends Sofa
{
    @Override
    public void buy() {
        System.out.println("Victorian sofa bought");
    }
}

class VictorianChair extends Chair
{

    @Override
    public void buy() {
        System.out.println("victorian chair bought");
    }
}