package com.Nikhil;

import java.util.Scanner;

public class EvenNumbers {
            public static void main(String[] args) {

                Scanner in  = new Scanner(System.in);
                System.out.print(" Enter Your No : ");
                int no = in.nextInt();

                for (int i = 1; i <= no; i++) {
                    if (i % 2 == 0) {
                        System.out.println(  " The Even Number is  : " + i );
                    }
                }
            }
        }



