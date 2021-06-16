/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex41;

import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.File;

public class input {
    //takes in path of file, add each name to an arraylist and returns arraylist back to main
    public static ArrayList<String> read(String filePath) throws IOException {
        ArrayList<String> nameList = new ArrayList<>();
        File file = new File(filePath); //takes in file path to read
        Scanner in = new Scanner(file);

        while (in.hasNext()) { //if input still has remaining characters -> keep reading
            nameList.add(in.nextLine().trim()); //adds entire line to arraylist and trims any excess spaces.
        }

        return nameList; //returns arraylist back to main
    }
}
