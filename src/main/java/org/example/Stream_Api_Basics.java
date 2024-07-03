package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class Stream_Api_Basics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("John","Herry","Doe"));
        list.stream().forEach(System.out::println);

        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,5,3,4,5));
        l2.stream().sorted().forEach(System.out::println);
        System.out.println("-----");

        list.stream().forEach(s -> {
            System.out.println(s);
        });

        Stream<String> stream = list.stream().filter(s -> s.contains("John"));
        System.out.println(stream.findFirst());

        List<String> flatMapped = list.stream().flatMap(s -> Stream.of(s.split(""))).collect(Collectors.toList());
        flatMapped.forEach(System.out::print);
    }
}