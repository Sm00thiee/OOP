package com.ict9.oop;

public class Ex7 {
    public static void main(String []args) {
        int a = Integer.parseInt(args[0]);
        if (a % 4 == 0 && a != 0) System.out.println("This is a leap year");
        else if (a % 400 == 0) System.out.println("This is a leap year");
        else System.out.println("This is not a leap year");
    }
}
