package com.example.example2;

/*
reference: https://www.java-forums.org/new-java/58082-how-reduce-fractions-java.html
 */

public class TestFraction2 {
    public static void main(String[] args){

        Fraction2 f1=new Fraction2(3,8);
        Fraction2 f2=new Fraction2(5,6);

        System.out.println(add(f1,f2));
    }

    public static int gfc(int a,int b){
        return a%b==0?b:gfc(b,a%b);
    }

    public static Fraction2 add(Fraction2 f1,Fraction2 f2){

        Fraction2 result=new Fraction2(0,1);

        int num=f1.num*f2.denom+f2.num*f1.denom;
        int denom=f1.denom*f2.denom;

        int x=gfc(num,denom);

        result.num=num/x;
        result.denom=denom/x;

        return result;
    }

}
