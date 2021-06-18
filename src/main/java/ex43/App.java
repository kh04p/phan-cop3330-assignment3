/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex43;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        //prompts user input for site name and author first
        System.out.print("Site name: ");
        String title = in.nextLine().trim();
        System.out.print("Author: ");
        String author = in.nextLine().trim();

        //stores default path to generate file and folders in.
        //need to not include file name as variable will be used to create directories as well.
        String filePath = String.format("C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\",
                title);

        //asks if user wants to create separate folders for js and css, then passes choices to generate items.
        System.out.print("Do you want to create a folder for JavaScript? ");
        String choiceJS = in.nextLine().trim().toLowerCase();
        System.out.print("Do you want to create a folder for CSS? ");
        String choiceCSS = in.nextLine().trim().toLowerCase();

        //generates all needed items and return string
        String output = website.generate(filePath, author, title, choiceJS, choiceCSS);
        System.out.println(output);
    }
}
