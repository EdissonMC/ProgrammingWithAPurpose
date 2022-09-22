package imageProcess;


import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageGen01 {

    public static void main(String[] args) throws IOException {
        System.out.println("prueba");

        //		 File initialImage = new File("C://Users/Rou/Desktop/image.jpg");
        //		String fileOut = args[0]; // destination file
        String fileOut = "image1.jpg"; // destination file


        // create BufferedImage of SIZE and TYPE
        final int SIDE = 1024;
        final int TYPE = BufferedImage.TYPE_INT_RGB;
        BufferedImage image = new BufferedImage(SIDE, SIDE, TYPE);

        final int LIMIT = 255; // limit of RGB values
        int c; // specific value for R G and B
        Color color;

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                //				c = (i + j) % LIMIT;
                c = (i * j) % LIMIT;
                color = new Color(c, c, c); // creates ‘gray’ values
                image.setRGB(i, j, color.getRGB()); // saves pixel

            }
        }

        File outputfile = new File(fileOut);
        ImageIO.write(image, "jpg", outputfile);

    }

}
