package com.example.example1;

/*
reference: https://www.dreamincode.net/forums/topic/64342-reducing-a-fraction/
 */

public class Fraction
{
    // Add and simplify a fraction
    public Fraction(int num, int den)
    {
        myNum = num;
        myDen = den;
    }

    // Adds the fractions
    public Fraction Add(Fraction f2)
    {
        int cd = FindCd(this.myDen, f2.myDen);

        int den1 = this.myDen;
        int den2 = f2.myDen;
        int num1 = this.myNum * (cd / den1);
        int num2 = f2.myNum * (cd / den2);
        int num3 = num1 + num2;
        Fraction f3 = new Fraction(num3, cd);

        return f3;
    }

    // Subtracts the fractions
    public Fraction Subtract(Fraction f2)
    {
        int cd = FindCd(this.myDen, f2.myDen);

        int den1 = this.myDen;
        int den2 = f2.myDen;
        int num1 = this.myNum * (cd / den1);
        int num2 = f2.myNum * (cd / den2);
        int num3 = num1 - num2;

        Fraction f4 = new Fraction(num3, cd);

        return f4;
    }

    // Multiplies the fractions
    public Fraction Multiply(Fraction f2)
    {
        int den1 = this.myDen;
        int den2 = f2.myDen;
        int num1 = this.myNum;
        int num2 = f2.myNum;

        int num3 = num1 * num2;
        int den3 = den1 * den2;

        Fraction f5 = new Fraction(num3, den3);

        return f5;
    }

    // Divides the fractions
    public Fraction Divide(Fraction f2)
    {
        int den1 = this.myDen;
        int den2 = f2.myDen;
        int num1 = this.myNum;
        int num2 = f2.myNum;

        int num3 = num1 * den2;
        int den3 = den1 * num2;

        Fraction f6 = new Fraction(num3, den3);

        return f6;
    }

    // Finds the common denominator
    public int FindCd(int a, int b)
    {
        int cd = a * b;
        return cd;
    }

    // Reduces the fraction
    public Fraction Reduce()
    {
        int gcd = FindGcd(this); // greatest common divisor

        int newNum = this.myNum;
        int newDen = this.myDen;
        newNum /= gcd;
        newDen /= gcd;

        Fraction f = new Fraction(newNum, newDen);
        return f;
    }

    // Finds GCD using Euclid's algorithm
    public int FindGcd(Fraction f)
    {
        int num1 = f.myNum;
        int num2 = f.myDen;

        if (num1 < 0)
            num1 = 0 - num1;
        if (num2 < 0)
            num2 = 0 - num2;

        while (num1 != num2)
        {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1;
    }

    public String toString()
    {
        return myNum + "/" + myDen;
    }

    private int myNum;
    private int myDen;
}
