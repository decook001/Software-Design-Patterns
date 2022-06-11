package AbstractFactoryMethod;

public class ModernFactory extends AbstractFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class ModernSofa extends Sofa
{
    @Override
    public void buy() {
        System.out.println("modern sofa bought.");
    }
}

class ModernChair extends Chair
{
    @Override
    public void buy() {
        System.out.println("modern chair bought");
    }
}