package com.java.general.playground.finally1;

public class Finally1 {
    public static void main(String[] args) {
        try {
            System.out.println("In try");
            throw new RuntimeException("Exception 1");
            // System.out.println("This is unreachable.");
        } catch (Exception e) {
            System.out.println("In catch");
            throw new RuntimeException("Exception 2");
            // System.out.println("This is unreachable.");
        } finally {
            System.out.println("In finally");
            throw new RuntimeException("Exception 2");
            // System.out.println("This is unreachable.");
        }
        // System.out.println("This is unreachable.");
    }
}
