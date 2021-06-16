/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void inputTest() throws IOException {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt";
        ArrayList<String> nameList = input.read(filePath); //reads file into arrayList to test
        Collections.sort(nameList); //sorts arrayList

        String expectedOutput = ("Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina\n");
        StringBuilder actualOutput = new StringBuilder(); //StringBuilder to turn arrayList into String for comparison

        for (int i = 0; i < nameList.size(); i++) {
            actualOutput.append(nameList.get(i)).append("\n");
        }

        assertEquals(expectedOutput, actualOutput.toString()); //test passed.
    }
}