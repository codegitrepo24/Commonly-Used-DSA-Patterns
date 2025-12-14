package Hashmap;

import java.util.HashMap;

public class InsertandFetch {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kundan", 23);
        map.put("Ritu", 18);
        map.put("Karan", 21);

        System.out.println(map.get("Ritu"));
        System.out.println(map.get("Unknown"));
        
    }
}
