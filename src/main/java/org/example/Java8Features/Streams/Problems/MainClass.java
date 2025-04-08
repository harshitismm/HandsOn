package org.example.Java8Features.Streams.Problems;

import org.example.Java8Features.Streams.Problems.FunctionalInterfaces.MultiplicationInterface;

public class MainClass {
    public static void main(String[] args) {
        MultiplicationInterface function = (a, b) -> a*b;
        System.out.print(function.multiply(2,3));
    }
}
