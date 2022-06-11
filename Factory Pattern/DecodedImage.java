package Factory_Method;

public class DecodedImage {
    String name;
    public DecodedImage(String aka)
    {
        name=aka;
    }

    public String getName()
    {
        System.out.println(name + "is decoded");
        return name;
    }
}
