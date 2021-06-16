/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex41;

import java.util.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt";
        ArrayList<String> nameList = input.read(filePath);
        Collections.sort(nameList); //sorts list alphabetically

        for (int i = 0; i < nameList.size(); i++) { //prints sorted list
            System.out.println(nameList.get(i));
        }
    }
}
