package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class json {
    public static ArrayList<Map<String, Object>> read(String filePath) {
        ArrayList<Map<String, Object>> returnList = new ArrayList<>();
        File file = new File(filePath); //reads file location into a file first.

        try {
            JsonElement element = JsonParser.parseReader(new FileReader(file)); //parses JSON file into a JSON element
            JsonObject object = element.getAsJsonObject(); //turns element into object to extract data

            //since products is an array in JSON file, it'll need to be a JsonArray
            JsonArray array = object.get("products").getAsJsonArray();

            for (JsonElement productElement : array) { //loop through all items in JsonArray
                JsonObject product = productElement.getAsJsonObject(); //turns parsed element into an object to extract data

                //extracts data into different variables
                String name = product.get("name").getAsString();
                Double price = product.get("price").getAsDouble();
                int quantity = product.get("quantity").getAsInt();

                //due to there being different variable types, Maps will have to be <String, Object>
                Map<String, Object> temp = new HashMap<>();
                //adds extracted values into Map
                temp.put("name", name);
                temp.put("price", price);
                temp.put("quantity", quantity);

                //adds Map into list to return
                returnList.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read JSON file. Try again.");
        }

        return returnList;
    }

    public static String search(ArrayList<Map<String, Object>> list, String name) {
        for (Map<String, Object> temp : list) {
            String tempName = (String) temp.get("name"); //needs to cast object to string before comparison
            if (tempName.equalsIgnoreCase(name)) {
                //returns product details if name matches.
                return String.format("Name: %s | Price: %.2f | Quantity: %d%n",
                        temp.get("name"), temp.get("price"), temp.get("quantity"));
            }
        }
        //returns error if product cannot be found.
        return "Product does not exist.";
    }
}
