/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex45;

import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        //directory path will be specified and file name will be added in read/create methods for ease of file creation.
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex45\\";
        //program passes in file path then prints out modified text or errors if there are issues.
        System.out.println(text.read(filePath));
    }
}
