package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtFileReader {
    String filePath;
    File file;

    List<String> result = new ArrayList<>();
    public TxtFileReader(String path){

    this.filePath = path;
    file =new File(filePath);
    result = reader(file);

    }

    public List<String> reader(File file) {
        List<String> readResult = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                readResult.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
        return readResult;
    }

    public List<String> getResult(){
        return result;
    }
}
