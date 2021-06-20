package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class text {
    public static ArrayList<Map<String, Integer>> scan(String filePath) {
        ArrayList<Map<String, Integer>> wordList = new ArrayList<>();
        try {
            File file = new File(filePath + "exercise46_input.txt");
            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                Map<String, Integer> word = new HashMap<>();
                int frequency = 0;

                Scanner lineIn1 = new Scanner(in.nextLine());
                lineIn1.useDelimiter(" ");

                for (Map<String, Integer> temp : wordList) {
                    if (temp.containsKey(lineIn1.next())) {
                        frequency = temp.get(lineIn1.next()) + 1;
                    }
                }

                word.put(lineIn1.next(), frequency);
                wordList.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file.");
        }
        return wordList;
    }
}
