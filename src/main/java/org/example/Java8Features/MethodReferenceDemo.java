package org.example.Java8Features;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        FunctionInterface f1 = Class2 :: Test;
        f1.SAM1();
    }
}

class Class2{
    static void Test(){
        System.out.println("This is a class test implementation");
    }
}
