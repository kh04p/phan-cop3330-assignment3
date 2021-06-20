package ex44;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void jsonTest() {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        ArrayList<Map<String, Object>> list =json.read(filePath);

        //needed to add /r before /n due to comparison between LF and CRLF
        String expected1 = "Name: Doodad | Price: 5.00 | Quantity: 10\r\n";
        String expected2 = "Name: Widget | Price: 25.00 | Quantity: 5\r\n";
        String expected3 = "Name: Thing | Price: 15.00 | Quantity: 5\r\n";

        String actual1 = json.search(list, "doodad");
        String actual2 = json.search(list, "widget");
        String actual3 = json.search(list, "tHiNG");

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }
}