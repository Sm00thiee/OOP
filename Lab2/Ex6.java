package com.ict9.oop;

public class Ex6 {
    public static void main(String []args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        double d = b * b - 4 * a * c;
        if (d >= 0){
            double x1 = (-b + Math.sqrt(d)) / 2* a;
            double x2 = (-b - Math.sqrt(d)) / 2* a;
            System.out.println(x1);
            System.out.println(x2);
        }
        else {
            System.out.println("No real root");
        }

    }
}
