/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex45;

import java.io.*;
import java.util.Scanner;

public class text {
    //method to read in file from path.
    public static String read(String filePath) {
        try {
            File file = new File(filePath + "exercise45_input.txt");
            Scanner in = new Scanner(file);
            StringBuilder scannedText = new StringBuilder(); //scans text into StringBuilder.

            while (in.hasNextLine()) {
                scannedText.append(in.nextLine()).append("\n"); //appends each line from file into StringBuilder.
            }

            //passes String to create a new file with modified text and returns that text back to main
            return create(scannedText.toString(), filePath);
        } catch (FileNotFoundException e) {
            return "Unable to read file.";
        }
    }

    public static String create(String scannedText, String filePath) {
        String replacedText = scannedText.replaceAll("utilize", "use"); //replaces text as needed.

        try { //creates new file and write replaced text to file.
            File file = new File(filePath + "exercise45_output.txt");
            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            output.write(replacedText);
            output.close();

            return replacedText; //return modified text back to read function then back to main.
        } catch (IOException e) {
            return "Unable to create new text file.";
        }
    }
}
