package org.example;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface_Examples {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        // Get value from the map by passing key
        System.out.println("Key: 2 ==> Value: " + map.get(2));

        // to check key is present or not in the map
        System.out.println("Key: 2 exists ==> " + map.containsKey(2));

        // putIfAbsent method
        System.out.println("Put If Absent : " + map.putIfAbsent(5,"Five"));

        System.out.println(" === " + map.putIfAbsent(4,"Fjjti"));

        //Iterate map

        map.computeIfAbsent(7,k -> "Seven");

        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Key:  " + e.getKey() + " ==   Value: " + e.getValue());
        }

    }
}
