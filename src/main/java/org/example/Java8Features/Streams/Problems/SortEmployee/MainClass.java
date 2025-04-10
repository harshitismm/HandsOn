package org.example.Java8Features.Streams.Problems.SortEmployee;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Harshit"));
        employees.add(new Employee(2,"Suhani"));
        employees.add(new Employee(3,"Ishita"));
        employees.add(new Employee(42,"Sparsh"));
        employees.add(new Employee(66,"Mudit"));
        employees.add(new Employee(87,"Munnu"));
        employees.add(new Employee(100,"Abhinn"));
        employees.add(new Employee(101,"Tejas"));
        employees.add(new Employee(199,"Anusha"));

        //Sort the employees in descending order by their emp id
        List<Employee> list2 =employees.stream().sorted((a,b)->(int)(b.getId()-a.getId())).toList();
        System.out.println(list2);
    }
}
