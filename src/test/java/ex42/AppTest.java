package ex42;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void fileTest() throws IOException {
        //original .txt file
        String filePath1 = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt";
        ArrayList<Map<String, String>> nameList = file.read(filePath1);
        Collections.sort(nameList, new sortSalary());

        //.txt file containing sorted values
        String filePath2 = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_test.txt";
        ArrayList<Map<String, String>> expectedList = file.read(filePath2);

        String expectedOutput = file.print(expectedList);
        String actualOutput = file.print(nameList);

        assertEquals(expectedOutput, actualOutput);
    }
}