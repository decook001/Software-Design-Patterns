package Factory_Method;


import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ImageReader ir=null;
        int tok=0;

        if(tok==1)
        {
            ir=new GifReader("gif");
        }
        else
        {
            ir=new JpegReader("jpeg");
        }

        DecodedImage dc=ir.getDecodedImage();
        dc.getName();
    }
}