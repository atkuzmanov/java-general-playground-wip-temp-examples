package com.example.example1;


/*
reference: https://www.dreamincode.net/forums/topic/64342-reducing-a-fraction/
 */

public class FractionClient
{

    public static void main(String[] args)
    {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);
        Fraction f3;
        Fraction f3r;
        Fraction f4;
        Fraction f4r;
        Fraction f5;
        Fraction f5r;
        Fraction f6;
        Fraction f6r;
        f3 = f1.Add(f2);
        f3r = f3.Reduce();
        System.out.println("" + f1 + " + " + f2 + " = " + f3 + " = " + f3r);
        f4 = f1.Subtract(f2);
        f4r = f4.Reduce();
        System.out.println("" + f1 + " - " + f2 + " = " + f4 + " = " + f4r);
        f5 = f1.Multiply(f2);
        f5r = f5.Reduce();
        System.out.println("" + f1 + " * " + f2 + " = " + f5 + " = " + f5r);
        f6 = f1.Divide(f2);
        f6r = f6.Reduce();
        System.out.println("" + f1 + " / " + f2 + " = " + f6 + " = " + f6r);
    }
}