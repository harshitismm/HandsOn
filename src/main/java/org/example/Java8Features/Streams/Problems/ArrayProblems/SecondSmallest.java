package org.example.Java8Features.Streams.Problems.ArrayProblems;

import java.lang.module.FindException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] numbers= {2,1,5,6,9};
//        FindException the fetchSecondSmallest() smallest element in an array
//        fetchSecondSmallest(numbers);
        //**********************************************
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
//        findTheCommonElements(arr1,arr2);
        //***********************************************
//        reverseArrayInPlace(arr1);
        String[] fruits = {"apple","banana","Avocado","watermelon","papaya","grapes"};
//        lengthOfLongestString(fruits);
        PrintLongestString(fruits);

    }

    public static void fetchSecondSmallest(int[] arr){
        int secondSmallestElement = Arrays.stream(arr). distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array does not have a second smallest element"));
                System.out.println(" Second Smallest Element in the given array is : " + secondSmallestElement) ;
    }

    public static void findTheCommonElements(int[] arr1, int[] arr2){
        List<Integer> list = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(number2 -> number2 == number)).boxed().toList();
        System.out.println("Common elements are : "+list) ;
    }

    public static void reverseArrayInPlace(int[] arr){
        IntStream.range(0,arr.length/2).forEach(i->{
            int temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        });
        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
    public static void lengthOfLongestString(String[] fruits){
        int max = Arrays.stream(fruits).mapToInt(fruit->fruit.length()).max().orElse(0);
        System.out.println("Length of longest String is: "+max);
    }

    public static void PrintLongestString(String[] fruits){
        Map<Integer, List<String>> map = Arrays.stream(fruits).collect(Collectors.groupingBy(String::length));
        System.out.println("Length of longest String is: "+map);
    }
}
