package com.example.example2;

/*
04-09-2012, 06:17 AM #1 uselessparadigm  uselessparadigm is offline
Member

Join Date
Apr 2012
Posts
3
Rep Power
0
Default How to reduce fractions in Java?
I'm new to these forums and I'm not sure if this is the right place to post this question, I hope that's alright. I'm writing a code for my intro to Java Class that manipulated fractions through the different opertions (add, subtr, mult, divide) I have everything done but I am stuck when it comes to reducing fractions I have absolutely no idea what I am supposed to do. My professor gave us this code:

Java Code:

private int gcf (int a , int b ) {
       return a%b == 0 ? b : gcf ( b , a%b );
       }
and he says we have to invoke it to simplify the fractions but I have no idea how to incorporate it into my code.

Here is my code (please excuse it's noobiness, I'm still learning):
Class 1:

Java Code:

public class Fraction {


    private int numerator;
    private int denominator;


 //constructor for building fractions
    public Fraction(int num, int denom){
        numerator = num;
        denominator = denom;
        }
//simplifying fractions
    private int gcf (int a , int b ) {
        return a%b == 0 ? b : gcf ( b , a%b );
        }


//addition
    public static Fraction add(Fraction F1, Fraction F2){
        if(F1.denominator==0 || F2.denominator==0){
            System.out.println("Undefined, you cannot divide by zero.");
        }
        if((F1.numerator*F2.denominator + F1.denominator*F2.numerator)==0 || (F1.numerator+F2.numerator)==0){
            System.out.println("Sum is: 0");
        }
        if(F1.denominator!=F2.denominator)
            return new Fraction((F1.numerator*F2.denominator + F1.denominator*F2.numerator),(F1.denominator*F2.denominator));
        else if (F1.denominator==F2.denominator)
            return new Fraction((F1.numerator+F2.numerator),(F1.denominator));
        return null;
        }
//subtraction
   public static Fraction subtract(Fraction F1, Fraction F2){
       if(F1.denominator==0 || F2.denominator==0){
        System.out.println("Undefined, you cannot divide by zero.");
    }
    if((F1.numerator*F2.denominator - F1.denominator*F2.numerator)==0 || (F1.numerator-F2.numerator)==0){

    }
    if(F1.denominator!=F2.denominator)
        return new Fraction((F1.numerator*F2.denominator - F1.denominator*F2.numerator),(F1.denominator*F2.denominator));
    else if (F1.denominator==F2.denominator)
        return new Fraction((F1.numerator-F2.numerator),(F1.denominator));
        return null;
    }
//multiply
   public static Fraction multiply(Fraction F1, Fraction F2){
       if(F1.denominator==0 || F2.denominator==0){
            System.out.println("Undefined, you cannot divide by zero.");
        }
       return new Fraction((F1.numerator*F2.numerator),(F1.denominator*F2.denominator));
   }
//divide
   public static Fraction divide(Fraction F1, Fraction F2){
       return new Fraction((F1.numerator*F2.denominator),(F1.denominator*F2.numerator));
   }
//comparing fraction

   public static Fraction compare(Fraction F1, Fraction F2){
       if((F2.denominator*F1.numerator) > (F2.numerator*F1.denominator)){
          System.out.println("Comparing Fraction 1 & Fraction 2: " + F1.numerator+"/"+F1.denominator + ">"+
       F2.numerator+ "/"+ F2.denominator);
         }
            else if((F2.denominator*F1.numerator) < (F2.numerator*F1.denominator)){
              System.out.println("Comparing Fraction 1 & Fraction 2: " + F1.numerator+"/"+F1.denominator + "<"+
                       F2.numerator+ "/"+ F2.denominator);
              }
            else if((F2.denominator*F1.numerator) == (F2.numerator*F1.denominator)){
                  System.out.println("Comparing Fraction 1 & Fraction 2: " + F1.numerator+"/"+F1.denominator + "="+
                           F2.numerator+ "/"+ F2.denominator);
                  }
    return null;

          }

  //printing the fraction
    public String toString(){
        return  numerator + "/" + denominator ;
    }

}

Class 2:

Java Code:

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
Reply With Quote Reply With Quote

-------

04-09-2012, 06:24 AM #2 pbrockway2  pbrockway2 is offline
Moderator

Join Date
Feb 2009
Location
New Zealand
Posts
4,717
Rep Power
16
Default Re: How to reduce fractions in Java?
gcf stands for greatest common factor. Eg the gcf of 24 and 16 is 8. Given a fraction like n/m we reduce it by diving the top and bottom by the gcd of n and m. Eg 16/24 becomes 2/3 after diving by 8.
Reply With Quote Reply With Quote

-------

04-09-2012, 01:00 PM #3 uselessparadigm  uselessparadigm is offline
Member

Join Date
Apr 2012
Posts
3
Rep Power
0
Default Re: How to reduce fractions in Java?
I don't understand how to write the gcd divided by numerator and denominator. Every time I try, it comes out to an error or it makes my two random fractions the same fraction. I don't know what I'm doing wrong, a lot of my code related to gcf ends up being guess work and stabs in the dark, hoping it will work out eventually.
Reply With Quote Reply With Quote
04-09-2012, 01:27 PM #4 JosAH's Avatar JosAH  JosAH is offline
Moderator

Join Date
Sep 2008
Location
Voorschoten, the Netherlands
Posts
14,421
Blog Entries
7
Rep Power
26
Default Re: How to reduce fractions in Java?
If you're doing things right (i.e. make your Fractions immutable) you only have to use the gcf( ... ) method in the constructor, i.e.

Java Code:

public Fraction(int n, int d) {
   int gcf= gcf(n, d);

   this.n= n/gcf;
   this.d= d/gcf;
}
kind regards,

Jos
Build a wall around Donald Trump; I'll pay for it.
Reply With Quote Reply With Quote

-------

04-09-2012, 02:02 PM #5 kosmos890  kosmos890 is offline
Member

Join Date
Apr 2012
Posts
44
Rep Power
0
Default Re: How to reduce fractions in Java?
I am a beginner. This might help
Java Code:

public class Main{

    public static void main(String[] args){

        Fraction f1=new Fraction(3,8);
        Fraction f2=new Fraction(5,6);

        System.out.println(add(f1,f2));
    }

    public static int gfc(int a,int b){
        return a%b==0?b:gfc(b,a%b);
    }

    public static Fraction add(Fraction f1,Fraction f2){

        Fraction result=new Fraction(0,1);

        int num=f1.num*f2.denom+f2.num*f1.denom;
        int denom=f1.denom*f2.denom;

        int x=gfc(num,denom);

            result.num=num/x;
            result.denom=denom/x;

        return result;
    }
}
class Fraction{

    public int num;
    public int denom;

    Fraction(int n,int d){
        num=n;
        denom=d;
    }

    public String toString(){
        return num+"/"+denom;
    }
}

-------

reference: https://www.java-forums.org/new-java/58082-how-reduce-fractions-java.html
 */


public class Fraction {

    private int numerator;
    private int denominator;


    //constructor for building fractions
    public Fraction(int num, int denom){
        numerator = num;
        denominator = denom;
    }
    //simplifying fractions
    private int gcf (int a , int b ) {
        return a%b == 0 ? b : gcf ( b , a%b );
    }


    //addition
    public static Fraction add(Fraction F1, Fraction F2){
        if(F1.denominator==0 || F2.denominator==0){
            System.out.println("Undefined, you cannot divide by zero.");
        }
        if((F1.numerator*F2.denominator + F1.denominator*F2.numerator)==0 || (F1.numerator+F2.numerator)==0){
            System.out.println("Sum is: 0");
        }
        if(F1.denominator!=F2.denominator)
            return new Fraction((F1.numerator*F2.denominator + F1.denominator*F2.numerator),(F1.denominator*F2.denominator));
        else if (F1.denominator==F2.denominator)
            return new Fraction((F1.numerator+F2.numerator),(F1.denominator));
        return null;
    }
    //subtraction
    public static Fraction subtract(Fraction F1, Fraction F2){
        if(F1.denominator==0 || F2.denominator==0){
            System.out.println("Undefined, you cannot divide by zero.");
        }
        if((F1.numerator*F2.denominator - F1.denominator*F2.numerator)==0 || (F1.numerator-F2.numerator)==0){

        }
        if(F1.denominator!=F2.denominator)
            return new Fraction((F1.numerator*F2.denominator - F1.denominator*F2.numerator),(F1.denominator*F2.denominator));
        else if (F1.denominator==F2.denominator)
            return new Fraction((F1.numerator-F2.numerator),(F1.denominator));
        return null;
    }
    //multiply
    public static Fraction multiply(Fraction F1, Fraction F2){
        if(F1.denominator==0 || F2.denominator==0){
            System.out.println("Undefined, you cannot divide by zero.");
        }
        return new Fraction((F1.numerator*F2.numerator),(F1.denominator*F2.denominator));
    }
    //divide
    public static Fraction divide(Fraction F1, Fraction F2){
        return new Fraction((F1.numerator*F2.denominator),(F1.denominator*F2.numerator));
    }
//comparing fraction

    public static Fraction compare(Fraction F1, Fraction F2){
        if((F2.denominator*F1.numerator) > (F2.numerator*F1.denominator)){
            System.out.println("Comparing Fraction 1 & Fraction 2: " + F1.numerator+"/"+F1.denominator + ">"+
                    F2.numerator+ "/"+ F2.denominator);
        }
        else if((F2.denominator*F1.numerator) < (F2.numerator*F1.denominator)){
            System.out.println("Comparing Fraction 1 & Fraction 2: " + F1.numerator+"/"+F1.denominator + "<"+
                    F2.numerator+ "/"+ F2.denominator);
        }
        else if((F2.denominator*F1.numerator) == (F2.numerator*F1.denominator)){
            System.out.println("Comparing Fraction 1 & Fraction 2: " + F1.numerator+"/"+F1.denominator + "="+
                    F2.numerator+ "/"+ F2.denominator);
        }
        return null;

    }

    //printing the fraction
    public String toString(){
        return  numerator + "/" + denominator ;
    }
}
