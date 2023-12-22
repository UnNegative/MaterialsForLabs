package org.example;

public class Main {
    public static void main(String[] args){
        int width =960;
        int height =540;
        String type ="gif";
        String path ="Input\\DS2.txt";

        TxtFileReader material = new TxtFileReader(path);
        DrawingImage.drawingPic(material.getResult(),width,height,type);

    }
}