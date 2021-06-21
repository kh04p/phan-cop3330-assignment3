package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class text {
    //method will return a complete and sorted arraylist back to main after scanning file for words and their frequencies
    public static ArrayList<Map<String, Integer>> scan(String filePath) {
        ArrayList<Map<String, Integer>> wordList = new ArrayList<>();
        try {
            File file = new File(filePath);
            Scanner in = new Scanner(file);

            //wordLoop will continue if scanned word already exists in arraylist
            wordLoop: while (in.hasNext()) {
                Map<String, Integer> word = new HashMap<>();
                int frequency = 1; //frequency will be initialized as 1 for new words
                String key = in.next();

                //loops through entire arraylist to see if word already exists
                for (int i = 0; i < wordList.size(); i++) {
                    Map<String, Integer> temp = wordList.get(i);

                    //if word exists in arraylist
                    if (temp.containsKey(key)) {
                        frequency += temp.get(key); //increments frequency by 1
                        word.put(key, frequency); //adds data to map
                        wordList.set(i, word); //changes existing map in arraylist to reflect new frequency
                        continue wordLoop; //continues with while loop (wordLoop)
                    }
                }

                //if word does not already exist in arrayList
                word.put(key, frequency); //adds data to map
                wordList.add(word); //adds map to arraylist
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file.");
        }

        wordList.sort(new sortText()); //sorts arraylist
        return wordList;
    }

    //loops through arraylist and prints each word with its frequency
    public static String print(ArrayList<Map<String, Integer>> wordList) {
        StringBuilder output = new StringBuilder();
        for (Map<String, Integer> word : wordList) {
            //statement below is needed to get individual key from a map inside arraylist
            //since .keySet() will return an array of all keys in maps, program will need to cast as well as access element 0 in array.

            String key = (String) word.keySet().toArray()[0];
            output.append(String.format("%s: ", key));
            for (int i = 0; i < word.get(key); i++) {
                output.append("*"); //prints stars for frequency that word appears in file
            }
            output.append("\n"); //formatting
        }
        return output.toString();
    }
}
