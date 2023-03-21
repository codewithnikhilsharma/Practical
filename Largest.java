package com.Nikhil;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of A : ");
        int a  = in.nextInt();

        System.out.print("Enter the value of B : ");
        int b = in.nextInt();

        System.out.print("Enter the value of C : ");
        int c = in.nextInt();

        // find the largest of three numbers

        int max = a;

        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.print("The Max Value is : " + max );
    }
}
