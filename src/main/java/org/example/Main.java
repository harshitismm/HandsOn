package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Patterns.pattern1();
        //Patterns.pattern2();
        //Patterns.pattern3();
        //Patterns.pattern4();
//        Patterns.pattern5();
//        Patterns.pattern6();
//        Patterns.pattern7();
//        Patterns.pattern8();
//        Patterns.pattern9();
//        Patterns.pattern10();
//        Patterns.pattern11();
//        Patterns.pattern12();
//        Patterns.pattern13();
//        Patterns.pattern14();
//        Patterns.pattern15();
//        Patterns.pattern16();
//        Patterns.pattern17();
//        Patterns.pattern18();
//        Patterns.pattern19();
//        int a=0001010;
//        System.out.println(~a);

//***********************************
//        //Greedy Algorithm for finding number of notes of each type in a certain amount
//        int amount=1680;
//        int count;
//        switch(amount){
//            case 1680:count=amount/100;
//                        amount=amount-(count*100);
//                        System.out.println("Number of 100 Rs. Notes:"+count);
//            case 50:count=amount/50;
//                amount=amount-(count*50);
//                System.out.println("Number of 50 Rs. Notes:"+count);
//            case 20:count=amount/20;
//                amount=amount-(count*20);
//                System.out.println("Number of 20 Rs. Notes:"+count);
//            default:
//                System.out.println("Number of 1 Re. Notes:"+amount);
//        }
//        ******************************
//        Homework question 1
//        ______________________________
//        System.out.print(Ap(100));
//        _______________________________
//        *******************************

//        Homework Question 2
//        check bits for two numbers and count the number of set bits i.e 1

        int a=2;
        int b=3;

        int count1=checkbits(a);
        int count2=checkbits(b);

//        System.out.println("Total number of set bits is: "+(count1+count2));
//        ************************************
        int n=10;
        System.out.println("number in fibbonaci of "+n+" is: "+fibbonaci(n));

    }

    static int Ap(int num){
        return ((3*num)+7);
    }

    static int checkbits(int num){

        int count=0;
        while(num!=0){
            if((num & 1)==1){
                count++;
            }
            num=num>>1;
        }

        return count;
    }

    static int fibbonaci(int n){
//        n=fibbonaci(n-1)+fibbonaci(n-2);
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<n;i++){
            c = a+b;
            a=b;
            b=c;
        }

        return c;
    }



}