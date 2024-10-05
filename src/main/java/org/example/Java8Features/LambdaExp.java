package org.example.Java8Features;

import java.util.function.BiConsumer;

public class LambdaExp {
    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer= (s1,s2)->System.out.println("My Full Name is: "+s1+s2);
        biConsumer.accept("Harshit ","Gupta");
    }
}
