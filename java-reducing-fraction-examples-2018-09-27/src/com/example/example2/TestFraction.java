package com.example.example2;

/*
reference: https://www.java-forums.org/new-java/58082-how-reduce-fractions-java.html
 */

public class TestFraction {


    public static void main ( String[] args ){

//fraction code (num, den)
        Fraction fr1 = new Fraction((int)(Math.random()*10), (int) (Math.random()*10)+1);
        Fraction fr2 = new Fraction((int)(Math.random()*10), (int) (Math.random()*10)+1);




        //print the fractions in multiple forms
        System.out.println("Fraction 1: " + fr1 + "\t\tFraction 2: " + fr2);

        System.out.println("Sum is: " + Fraction.add(fr1, fr2));
        System.out.println("Difference is: " + Fraction.subtract(fr1,fr2));
        System.out.println("Product is: " + Fraction.multiply(fr1, fr2));
        System.out.println("Quotient is: " + Fraction.divide(fr1, fr2));
        System.out.print(Fraction.compare(fr1, fr2));
    }

}
