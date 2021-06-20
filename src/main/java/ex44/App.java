/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex44;

import java.util.Scanner;
import java.util.*;

public class App {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        Scanner in = new Scanner(System.in);
        String user;

        //list of maps of items read of JSON file will be created first.
        ArrayList<Map<String, Object>> list =json.read(filePath);

        //program will loop to ask user for product name until a product is found
        do {
            System.out.print("Enter a product name: ");
            String name = in.nextLine().trim(); //takes in and trims any excess whitespace for user input.
            user = json.search(list, name); //passes user input and JSON list to search
            System.out.println(user); //prints results
        } while (user.equals("Product does not exist."));
    }
}
