package com.ict9.oop;

public class Ex3 {
    public static void main(String []args) {
        int n = Integer.parseInt(args[0]);
        double b = Math.random();
        int c = (int) (b * n);
        System.out.println(c);
    }
}
