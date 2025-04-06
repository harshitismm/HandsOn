package org.example.Java8Features;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() >= 5;

        Predicate<String> checkEvenLength = s -> s.length()%2==0;

        //Predicates can be joined using AND,OR,NEGATE
        //1. AND (Check if the string is greater than 5 and even)
        System.out.println("Check if the string is greater than 5 and even: " +checkLength.and(checkEvenLength).test("Harshi"));
        //2. OR (Check if the string is greater than 5 or even)
        System.out.println("Check if the string is greater than 5 or even: " +checkLength.or(checkEvenLength).test("Harshi"));
        //3. Negate
        System.out.println("The length is even : " + checkEvenLength.negate().test("Harshit Gupt"));
    }

}
