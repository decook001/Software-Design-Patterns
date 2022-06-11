package Factory_Method;

public class GifReader implements ImageReader {

    DecodedImage image;
    GifReader(String name)
    {
        image=new DecodedImage(name);

    }

    @Override
    public DecodedImage getDecodedImage() {
        return image;
    }
}
