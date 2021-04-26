package util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtil {

    public static void MergeImage(String baseImageFullName, String addImageFullName, String mergedImageFullName) {

        try {
            BufferedImage image1 = ImageIO.read(new File(baseImageFullName));
            BufferedImage image2 = ImageIO.read(new File(addImageFullName));

            int width = Math.max(image1.getWidth(), image2.getWidth());
            int height = Math.max(image1.getHeight(), image2.getHeight());

            BufferedImage mergedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            Graphics2D graphics = (Graphics2D) mergedImage.getGraphics();
            graphics.drawImage(image1, 0, 0, null);
            graphics.drawImage(image2, image1.getWidth() * 2/3, image1.getHeight() * 2/3, null);

            ImageIO.write(mergedImage, "png", new File(mergedImageFullName));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
