package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_Class_Example {
    public static void main(String[] args) {
        LinkedList<Integer> intLl1 = new LinkedList<>(Arrays.asList(98,2,4,1,6));

        // addFirst() method to add element at first position(index: 0) in the list
        intLl1.addFirst(12);

        //addLast() method to add elemtn at Last index in the list
        intLl1.addLast(289);

        System.out.println("Update List : " + intLl1);

        /*
         removeFirst() and removeLast() methods to remove first and last elements
         from the list
         */
         intLl1.removeFirst();

         System.out.println("After removing the first element: " + intLl1);

    }
}
