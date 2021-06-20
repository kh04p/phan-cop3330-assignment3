/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class website {

    public static String generateHTML(String filePath, String author, String title) throws IOException {
        //contents of the file being generated
        String content = String.format("<!DOCTYPE html>\n<html>\n<head>\n" +
                "<title>%s</title>\n<meta name=\"author\" content=\"%s\">\n" +
                "</head>\n</html>", title, author);

        //catch any IO exceptions when attempting to create html file.
        try {
            File file = new File(filePath);
            //creates bufferedWriter to write to html file and close afterwards.
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            output.write(content);
            output.close();
            return String.format("Generated file at %s%n", filePath); //returns confirmation after creating file.
        } catch (IOException e ) {
            return "Unable to generate HTML file."; //returns confirmation if unable to create file.
        }
    }

    //creates directory using mkdirs
    public static String generateDir(String dirPath) {
        File file = new File(dirPath);
        file.mkdirs();
        return String.format("Generated directory at %s%n", dirPath);
    }

    public static String generate(String filePath, String author, String title, String choiceJS, String choiceCSS) throws IOException {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder(); //StringBuilder to append all confirmations from file/folder creation.

        //if-else statements to decide whether to create JS/CSS folders or not
        if (choiceJS.equals("y")) {
            if (choiceCSS.equals("y")) {
                output.append(generateDir(filePath + "css\\"));
            }
            output.append(generateDir(filePath + "js\\"));
            output.append(generateHTML(filePath + "index.html", author, title));
        }
        else {
            if (choiceCSS.equals("y")) {
                output.append(generateDir(filePath + "css\\"));
            }
            output.append(generateHTML(filePath + "index.html", author, title));
        }
        return output.toString();
    }
}
