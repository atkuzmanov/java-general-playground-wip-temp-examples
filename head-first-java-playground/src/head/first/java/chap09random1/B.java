package head.first.java.chap09random1;

abstract public class B implements A {
    int b1 = a1;

    abstract void abstractMethod2();

    public String bMethod1(int a, String b) {
        return "Class B; Arguments wre - String: " + b + " and int: " + a;
    }
}
