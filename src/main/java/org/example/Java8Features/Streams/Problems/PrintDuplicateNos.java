package org.example.Java8Features.Streams.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNos {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,27,87,90,23,28,27,10,87,90,90,90);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(e->System.out.print(e+" "));
    }
}
