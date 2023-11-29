package org.example;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;

public class DrawingImage {

    public static final Color purple = new Color(175,0,255);
    public static final Color PURPLE = purple;
    public static BufferedImage drawingPic(List<String> raw ,int widthImage,int heightImage,String type) {
        // Define the image dimensions
        int width = widthImage;
        int height = heightImage;
        //raw -> midRaw
        String[][] strings =new String[raw.size()][2];
        int i=0;
        for (String str:raw) {
            strings[i] = str.split(" ");
            i++;
        }

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        java.awt.Graphics graphics = bufferedImage.getGraphics();

        //BackGround Drawing
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);

        // Draw Read DataSet
        graphics.setColor(PURPLE);
        for (int j = 0; j < strings.length; j++) {
            graphics.fillRect(Integer.parseInt(strings[j][1]),Integer.parseInt(strings[j][0]),1,1);

        }
        graphics.dispose();
        try {
            File outputfile = new File("Output\\pathResult."+type);
            ImageIO.write(bufferedImage, type, outputfile);
            System.out.println("Image saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedImage;
    }
}
