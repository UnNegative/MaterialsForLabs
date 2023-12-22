package org.example;

import java.math.*;
public class Main {
    public static void main(String[] args){
        int width =960;
        int height =540;
        int angle = 30;
        int xCenter = 480;
        int yCenter = 480;

        double radians = angle*(Math.PI/180);
        String type ="png";
        String path ="Input\\DS2.txt";

        TxtFileReader material = new TxtFileReader(path);
        DrawingImage.drawingPic(material.getResult(),width,height,xCenter,yCenter,type,radians);

    }
}