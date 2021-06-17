package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class website {
    public static void generateHTML(String filePath, String author, String title) {
        File file = new File(filePath);
        if (file.exists()) {
            /*FileWriter writeToFile = new FileWriter(filePath);
            writeToFile.write(String.format("<!DOCTYPE html>\n<html>\n<head>\n" +
                    "<title>%s</title>\n<meta name=\"author\" content=\"%s\">\n" +
                    "</head>\n</html>", title, author));*/
            System.out.printf("Created %s%n", filePath);
        }
        else {
            System.out.println("File already exists.");
        }

    }

    public static void generateDir(String dirPath) {
        File file = new File(dirPath);
        if (!file.exists()) {
            file.mkdir();
            System.out.printf("Created %s%n", dirPath);
        }
        else {
            System.out.println("File already exists.");
        }
    }
}
