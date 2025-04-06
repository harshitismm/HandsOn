package org.example.Java8Features.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/*
* If we want to collect elements of stream after filtering or
* mapping and add them to the required collection then use collect method.
*
*   Stream< Integer> fileterdStream = openStream. filter(i -› i >= 20);
    List<Integer> newFileterdListOrigin = fileterdStream.collect(Collectors.toList());
    newFileterdListOrigin.stream().forEach(x -> System.out.println(x));
*
* */
public class CollectDemo {

    //List = {2,3,4,5,6,7,8,9,0,1,111,1213,21313,242}
    //Print all the numbers divisible by two.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,0,1,111,1213,21313,242);
        List<Integer> filteredList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        filteredList.forEach(x->System.out.print(x+" "));
    }


}
