package ex42;

import java.util.Comparator;
import java.util.Map;

public class sortSalary implements Comparator {
    public int compare(Object o1, Object o2) {
        Map<String, String> name1 = (Map<String, String>) o1; //casts object to Map first
        Map<String, String> name2 = (Map<String, String>) o2;
        return name1.get("salary").compareTo(name2.get("salary")); //returns value of comparison between 2 maps
    }
}
