package example2;

import example1.Example2;

public class Example2_1 {

    public static int a = 0;

    public transient int b = 1;

    public static transient int c = 2;

    public static transient volatile int d = 3;

    public final static transient int e = 4;

    public static transient volatile int f = 5;

    public static void main(String[] args) {
        Example2_1 e21 = new Example2_1();

        System.out.println(
                a + " " +
                        e21.b + " " +
                        c + " " +
                        d + " " +
                        e + " " +
                        f
        );
    }
}
