package org.example;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface_Examples {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();

        intSet.add(90);
        intSet.add(1);
        intSet.add(945);
        intSet.add(null);
        System.out.println(intSet);

        // Set will not allow duplicates
        intSet.add(1);

        System.out.println(intSet);

        System.out.println("Set is empty : " + intSet.isEmpty());

        intSet.remove(1);
        System.out.println("Updated List: " + intSet);

    }
}
