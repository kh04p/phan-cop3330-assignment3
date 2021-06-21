/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Khoa Phan
 */
package ex46;

import java.util.Comparator;
import java.util.*;

public class sortText implements Comparator {
    public int compare(Object o1, Object o2) {
        //since .values() only return an array of existing values for map, cast will be needed and method will need to access element 0.

        Map<String, Integer> map1 = (Map<String, Integer>) o1;
        int counter1 = (int) map1.values().toArray()[0];

        Map<String, Integer> map2 = (Map<String, Integer>) o2;
        int counter2 = (int) map2.values().toArray()[0];

        return counter2 - counter1; //returns to sort in descending order.
    }
}
