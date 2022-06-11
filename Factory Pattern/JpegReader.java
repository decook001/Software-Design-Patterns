package Factory_Method;

public class JpegReader implements ImageReader {
    DecodedImage name;

    JpegReader(String image)
    {
        name=new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return name;
    }
}
