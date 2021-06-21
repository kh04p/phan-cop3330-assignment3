/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void textTest() {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt";

        String expectedOutput = "badger: *******\nmushroom: **\nsnake: *\n";
        String actualOutput = text.print(text.scan(filePath));

        assertEquals(expectedOutput, actualOutput); //test passed.
    }
}