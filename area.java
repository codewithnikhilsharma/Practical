package com.Nikhil;

import java.util.Scanner;

    public class area {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                final double PI = 3.14159;
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                double area = PI * radius * radius;

                System.out.println("The area of the circle is: " + area);
            }
        }


