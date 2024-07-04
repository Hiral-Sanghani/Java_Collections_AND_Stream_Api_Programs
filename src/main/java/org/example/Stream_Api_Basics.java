package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Stream_Api_Basics {
    public static void main(String[] args) {

        // Iterate list using stream
        List<String> list = new ArrayList<>(Arrays.asList("C", "Java", "Python"));
        list.stream().forEach(System.out::println);

        System.out.println("-------");

        // sort list and print using stream
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 5, 3, 4, 9, 2, 8, 10));
        l2.stream().sorted().forEach(System.out::println);

        System.out.println("-----");

        //enhanced for loop on stream
        list.stream().forEach(s -> {
            System.out.println(s);
        });

        System.out.println("-------");

        // filter and fetch any match string
        Stream<String> stream = list.stream().filter(s -> s.contains("Java"));
        System.out.println(stream.findFirst());

        System.out.println("-------");

        // more methods in filter
        list.stream().filter(s -> !s.equals("Java")).forEach(System.out::println);

        System.out.println("-------");

        List<Integer> resultList = l2.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("List which is dividable by 2: " + resultList);

        // Print square of element which is not dividable by 2
        System.out.println("Square of the elements which are not dividable by 2");
        l2.stream().filter(n-> !(n%2 == 0)).map(x -> x * x).forEach(System.out::println);

        System.out.println("-----------");
        // peek() method for debugging
        l2.stream().map(x -> x * 2).peek(System.out::println)
                .filter(n -> n > 15)
                .forEach(System.out::println);


        System.out.println("-------");
        // flatMap - it will combine elements and print in one line
        List<String> flatMapped = list.stream().flatMap(s -> Stream.of(s.split(""))).collect(Collectors.toList());
        flatMapped.forEach(System.out::print);


    }
}