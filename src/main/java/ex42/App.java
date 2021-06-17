package ex42;

import ex41.input;

import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt";
        ArrayList<Map<String, String>> nameList = file.read(filePath); //takes in list of maps containing first, last and salary of employees.
        //String output = file.print(nameList);

        System.out.println();
        Collections.sort(nameList, new sortSalary()); //sorts based on salary

        String output = file.print(nameList);
        System.out.println(output);
    }
}
