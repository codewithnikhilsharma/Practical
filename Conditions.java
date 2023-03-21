package com.Nikhil;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        System.out.print(" Enter Your Salary : ");

        Scanner in =  new Scanner(System.in);
        int Salary = in.nextInt();

        if(Salary > 25000 ) {
            Salary = Salary + 3000;
        }

        else if (Salary > 30000){
            Salary += 4000;
        }

        else {
            Salary += 1000;
        }
        System.out.print("Your Salary + Bonous is : " + Salary );
    }
}
