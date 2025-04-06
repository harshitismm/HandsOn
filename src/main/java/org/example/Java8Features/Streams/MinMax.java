package org.example.Java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        System.out.println("Min number from list is "+list.stream().min((a, b)->a-b).stream().toList());
        System.out.println("Max number from list is "+list.stream().max((a, b)->a-b).stream().toList());
    }


}
