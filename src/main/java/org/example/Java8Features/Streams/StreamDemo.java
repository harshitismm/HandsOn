package org.example.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);
        //Print all the numbers that are greater than 12
        List<Integer> refList= list.stream().filter(x -> x>12).collect(Collectors.toList());
        System.out.println(refList);
        //Printing only elements
        refList.stream().forEach(x-> System.out.print(x+" "));
    }
}
