package ex46;

import java.util.*;

public class App {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\khoa1\\IdeaProjects\\COP3330\\phan-cop3330-assignment3\\src\\main\\java\\ex46\\";
        ArrayList<Map<String, Integer>> wordList = text.scan(filePath);
        for (Map<String, Integer> word : wordList) {
            String key = (String) word.keySet().toArray()[0];
            System.out.printf("%s showed up %d times.%n", key, word.get(key));
        }
    }
}
