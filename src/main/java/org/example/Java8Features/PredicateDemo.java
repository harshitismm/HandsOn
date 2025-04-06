package org.example.Java8Features;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("The length of string is greater than 5 : " + checkLength.test("Harshit Gupta"));
    }

}
