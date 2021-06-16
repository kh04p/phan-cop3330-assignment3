package ex42;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void fileTest() throws IOException {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt";
        ArrayList<Map<String, String>> nameList = file.read(filePath);
        Collections.sort(nameList, new sortSalary());

        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append(String.format("%-10s|%-10s|%-10s%n", "LAST", "FIRST", "SALARY"));
        expectedOutput.append(String.format("----------|----------|----------%n"));
        expectedOutput.append(String.format("%-10s|%-10s|$%-10s%n", "Swift", "Geoffrey", "$14200"));
        expectedOutput.append(String.format("%-10s|%-10s|$%-10s%n", "Jones", "Chris", "$34500"));
        expectedOutput.append(String.format("%-10s|%-10s|$%-10s%n", "Jones", "Aaron", "$46000"));
        expectedOutput.append(String.format("%-10s|%-10s|$%-10s%n", "Zarnecki", "Sabrina", "$51500"));
        expectedOutput.append(String.format("%-10s|%-10s|$%-10s%n", "Ling", "Mai", "$55900"));
        expectedOutput.append(String.format("%-10s|%-10s|$%-10s%n", "Johnson", "Jim", "$56500"));
        expectedOutput.append(String.format("%-10s|%-10s|$%-10s%n", "Xiong", "Fong", "$65000"));

        String actualOutput = file.print(nameList);

        assertEquals(expectedOutput.toString(), actualOutput);
    }
}