package head.first.java.chap10random1;

public class Random1 {
    static int a = 1;
    static final int B = 2;
    final int c = 3;

    static {
        System.out.println(a);
        System.out.println(B);
        int d = 4;
        System.out.println(d);
    }

    Random1() {
        System.out.println("constructor 1");
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("main");
        Random1 r1 = new Random1();
        r1.randomMethod1();
    }

    public void randomMethod1() {
        System.out.println("randomMethod1");
    }
}
