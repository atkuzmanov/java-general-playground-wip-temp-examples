package com.example.example2;

/*
reference: https://www.java-forums.org/new-java/58082-how-reduce-fractions-java.html
 */

public class Fraction2 {
    public int num;
    public int denom;

    Fraction2(int n,int d){
        num=n;
        denom=d;
    }

    public String toString(){
        return num+"/"+denom;
    }
}
