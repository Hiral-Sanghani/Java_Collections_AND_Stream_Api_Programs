package org.example;

import java.util.*;


public class List_Interface {
    public static void main(String[] args) {

        //String List
        List<String> stringList = new ArrayList<>(Arrays.asList("John Herry","Doe","Olga","Amer"));

        //Get Size of the list
        System.out.println("String List Size: " + stringList.size());

        //Integer List
        ArrayList<Integer> intList1 = new ArrayList<>(Arrays.asList(90,2,14,5,4));
        System.out.println(intList1);

        //reverse list
        Collections.reverse(intList1);
        intList1.remove(2);

        //Replace any element
        intList1.set(1,89);

        /* Remove Specific Element
         intList1.remove(new Integer(2));   */

        System.out.println(intList1);

        //Convert List to Array
        Integer[] a = intList1.toArray(new Integer[0]);

        for(Integer i: a)
            System.out.println(i);

        List<Integer> intList2 = new LinkedList<>();
        intList2.add(3);
        intList2.add(1);
        intList2.add(98);

        System.out.println(intList2);

        //get specific element from index
        System.out.println(intList2.get(2));

        System.out.println("---------");
        // Apply Iterator
        // Iterator<Integer> integerIterator = intList2.iterator();
        ListIterator<Integer> integerIterator1 = intList2.listIterator();
        while(integerIterator1.hasNext()) {
            System.out.println(integerIterator1.next());
        }

        //Apply ListIterator - it will allow to iterate list from both side

        System.out.println("----");

        while(integerIterator1.hasPrevious()) {
            System.out.println(integerIterator1.previous());
        }

        //Find Min and Max element from the list
        System.out.println("Min from the List: " + Collections.min(intList2));

        System.out.println("Max from the List: " + Collections.max(intList2));


        /*
        Contains() method
        removeIf() method
         */
        System.out.println("List contains 2 : " + intList1.contains(2));

        intList1.removeIf(element -> element == 2);
        System.out.println(intList1);
    }
}