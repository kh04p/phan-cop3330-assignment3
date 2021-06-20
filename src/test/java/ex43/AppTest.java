/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex43;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void websiteTest() throws IOException {
        String title = "Generic Site";
        String author = "John Doe";
        String choiceJS = "y"; //if JS folder will be created or not.
        String choiceCSS = "y"; //if CSS folder will be created or not.
        String filePath = String.format("C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\",
                title);

        String actualOutput = website.generate(filePath, author, title, choiceJS, choiceCSS);

        //needed to add /r before /n due to comparison between LF and CRLF
        String expectedOutput = String.format(
                "Generated directory at C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\css\\\r\n" +
                "Generated directory at C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\js\\\r\n" +
                "Generated file at C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex43\\%s\\index.html\r\n",
                title, title, title);

        assertEquals(expectedOutput, actualOutput);
    }
}