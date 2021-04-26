import util.ImageUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        //이미지 병합
        ImageUtil.MergeImage("d:\\temp9\\0.png", "d:\\temp9\\signResult.png", "d:\\temp9\\mergedImage.png");



    }
}
