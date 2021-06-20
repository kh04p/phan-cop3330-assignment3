/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void textTest() {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex45\\";

        String actualOutput = text.read(filePath);
        String expectedOutput = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".\n";

        assertEquals(expectedOutput, actualOutput);
    }
}