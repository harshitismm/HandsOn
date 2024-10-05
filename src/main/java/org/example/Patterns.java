package org.example;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.AbstractCollection;
import java.util.Scanner;

public class Patterns {
    //    123
    //    123
    //    123
    public static void pattern1() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //    321
    //    321
    //    321
    public static void pattern2() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        while (i <= n) {
            int j = n;
            while (j >= 1) {
                System.out.print(j + " ");
                j--;
            }
            System.out.println();

            i++;
        }
    }

    //    123
    //    456
    //    789
    public static void pattern3() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        int c = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(c + " ");
                c++;
                ;
                j++;
            }
            System.out.println();
            i++;
        }

    }

    //    *
    //    **
    //    ***
    public static void pattern4() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //1
    //22
    //333
//    4444
    public static void pattern5() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //    1
//    23
//    456
//    78910
    public static void pattern6() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        int c = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(c + " ");
                j++;
                c++;
            }
            System.out.println();
            i++;
        }
    }

    //    1
//    23
//    345
//    4567
    public static void pattern7() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        while (i <= n) {
            int j = 1;
            int temp = i;
            while (j <= i) {
                System.out.print(temp + " ");
                temp++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //    1
//    21
//    321
//    4321
    public static void pattern8() {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        while (i <= n) {
            int j = i;

            while (j >=1) {
                System.out.print(j+" ");
                j--;
            }
            System.out.println();
            i++;
        }
    }
//    AAA
//    BBB
//    CCC
    public static void pattern9(){
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scanner.nextInt();
        char ch='A';
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(ch+" ");
                j++;
            }
            ch++;
            System.out.println();
            i++;
        }
    }
//    ABC
//    DEF
//    GHI
    public static void pattern10(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=1;
        char ch='A';
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(ch+" ");
                j++;
                ch++;
            }
            System.out.println();
            i++;
        }
    }

    //ABC
    //BCD
//    CDE
    public static void pattern11(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=0;

        while(i<n){
            char ch='A';
            int j=1;
            while(j<=n){
                System.out.print((char)(ch+i)+" ");
                j++;
                ch++;
            }
            i++;
            System.out.println();
        }
    }
    //A
    //BB
    //CCC
    public static void pattern12(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=1;
        char ch='A';

        while(i<=n){

            int j=1;
            while(j<=i){
                System.out.print(ch+" ");
                j++;
            }
            ch++;
            i++;
            System.out.println();
        }
    }
//    A
//    BC
//    CDE
//    DEFG
    public static void pattern13(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=0;

        while(i<n){
            char ch='A';
            int j=0;
            while(j<=i){
                System.out.print((char)(ch+i)+" ");
                j++;
                ch++;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern14(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            char ch='A';
            int j=1;
            while(j<=i){
                System.out.print((char)(ch+n-i)+" ");
                ch++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
//    ___*[i=1,k=3,j=1]
//    __**{i=2,k=2,j=2]
//    _***[i=3,k=1,j=3]
//    ****
    public static void pattern15(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=1;

        while(i<=n){
            int space=n-i;
            while(space>=1){
                System.out.print(" ");
                space--;
            }
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
//    **** n=4,i=1,j=4 (j-i)
//    ***  n=4,i=2;j=3
//    **   n=4,i=3,j=2
//    *    n=4,i=4,j=1

    public static void pattern16(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int j=n-i;
            while(j>0){
                System.out.print(j);
                j--;
            }
            i++;
            System.out.println();
        }
    }
    //**** n=4,i=0,j=4
    // *** n=4,i=1;j=3,k=1
    //  **      i=2;j=2,k=2
    //   *      i=3,j=1,k=3
    public  static void pattern17(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int k=1;
            int j=n-i;
            while(k<=i){
                System.out.print(" ");
                k++;
            }
            while(j>=1){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
    //  1
    // 121
    //12321
    public static void pattern18(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int extra=i-1;
            int space=n-i;
            int j=1;
            while(space>=1){
                System.out.print(" ");
                space--;
            }
            while(j<=i){
                System.out.print(j);
                j++;
            }
            while(extra>0){
                System.out.print(extra);
                extra--;
            }
            System.out.println();
            i++;
        }
    }

    public static void pattern19(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i=0;
        while(i<n){
            int j=1;
            int k=n-i;
            int star=1;
            while(j<=(n-i)){
                System.out.print(j);
                j++;
            }
            while(star<=i*2){
                System.out.print("*");
                star++;
            }
            while(k>=1){
                System.out.print(k);
                k--;
            }

            System.out.println();
            i++;
        }
    }

}
