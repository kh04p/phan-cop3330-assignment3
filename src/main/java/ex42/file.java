package ex42;

import java.util.Scanner;
import java.util.*;
import java.io.IOException;
import java.io.File;

public class file {
    public static ArrayList<Map<String, String>> read(String filePath) throws IOException {
        ArrayList<Map<String, String>> nameList = new ArrayList<>();
        File file = new File(filePath); //takes in file path to read
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) { //reads individual lines
            Scanner lineIn = new Scanner(in.nextLine()); //reads individual characters in current line
            lineIn.useDelimiter(","); //separates different words using comma
            Map<String, String> name = new HashMap<>(); //puts all information into a Map that represents a single employee
            while (lineIn.hasNext()) {
                name.put("last", lineIn.next());
                name.put("first", lineIn.next());
                name.put("salary", lineIn.next());
            }
            nameList.add(name); //adds Map back into List of Maps.
        }

        return nameList; //returns arraylist back to main
    }

    public static String print(ArrayList<Map<String, String>> nameList) {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%-10s|%-10s|%-10s%n", "LAST", "FIRST", "SALARY"));
        output.append(String.format("----------|----------|----------%n"));
        for (int i = 0; i < nameList.size(); i++) {
            Map<String, String> temp = nameList.get(i);
            output.append(String.format("%-10s|%-10s|$%-10s%n", temp.get("last"), temp.get("first"), temp.get("salary")));
        }
        return output.toString();
    }
}
