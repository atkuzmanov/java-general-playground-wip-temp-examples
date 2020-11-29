package com.java.general.playground.innernestedlocalclass;

public class Example1 {

    public static final class NestedStaticClass {
        public static int a = 1;

        public static void nestedClass1StaticMethod1() {
            System.out.println("nestedClass1StaticMethod1");
        }

        public String nestedClass1Method1() {
//            System.out.println("nestedClass1Method1");
            return "nestedClass1Method1";
        }
    }

    public void method1() {
        class InnerClass1 {
            public void innerClassMethod1() {
                System.out.println("innerClassMethod1");
            }
//            Example1 e1 = new Example1();
//            e1.method3();
        }

        InnerClass1 ic1 = new InnerClass1();
        ic1.innerClassMethod1();

        NestedStaticClass.nestedClass1StaticMethod1();
    }

    public static void staticMethod2() {
        NestedStaticClass.nestedClass1StaticMethod1();
    }

    public void method3() {

    }

    class InnerClass2 {
        public void innerClass2Method1() {
            System.out.println("innerClass2Method1");
        }
    }

    public static void main(String[] args) {
        Example1.NestedStaticClass.nestedClass1StaticMethod1();
        Example1.staticMethod2();

        Example1 e1 = new Example1();
        e1.method1();

//        Example1.InnerClass2 e1ic2 = new Example1.InnerClass2();
        Example1.NestedStaticClass e1nsc = new Example1.NestedStaticClass();
        System.out.println(e1nsc.a);
        System.out.println(e1nsc.nestedClass1Method1());
        System.out.println(Example1.NestedStaticClass.a);
    }
}
