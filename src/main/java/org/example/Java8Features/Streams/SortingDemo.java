package org.example.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,0,1,111,1213,21313,242);
        System.out.println("Ascending Order: ");
        List<Integer> list2= list.stream().sorted().toList();
        System.out.println(list2);
        System.out.println("Descending Order: ");
        List<Integer> list3= list.stream().sorted((a,b)->b-a).toList();
        System.out.println(list3);
    }
}
