import java.util.*;

public class HashTableIntro {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("101", "Mausam");
        table.put("102", "Rajesh");
        table.put("103", "Rahul");
        table.put("104", "Kartik");
        table.put("105", "misti");

        for (String key : table.keySet()) {
            System.out.println(key + " " + table.get(key) + " " + key.hashCode());
        }
    }
}
