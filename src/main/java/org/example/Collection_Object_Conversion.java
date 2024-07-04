package org.example;

import java.util.*;

public class Collection_Object_Conversion {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        //Convert from set to map
        Set<Map.Entry<Integer,String>> set = map.entrySet();

        for (Map.Entry<Integer, String> e : set) {
            System.out.println("Entry : " + e.getKey() + "," + e.getValue());

        }

        System.out.println("----------");

        //Convert array to set
        Set<String> set1 = new HashSet<>(Arrays.asList("Hi", "john"));
        System.out.println(set1);

        System.out.println("----------");
        //Convert set to array
        String[] stringArray = set1.toArray(new String[0]);
        for (String s : stringArray) {
            System.out.println(s);

        }
    }
}
