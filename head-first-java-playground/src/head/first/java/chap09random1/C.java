package head.first.java.chap09random1;

public class C extends B {

    @Override
    void abstractMethod2() {

    }

    @Override
    public void abstractMethod1() {

    }

    @Override
    public String bMethod1(int a, String b) {

        return "Overriden bMethod1(int a, String b) from class C.";
    }

    public String bMethod1(String b, int a) {

        return "bMethod1(String b, int a) from class C with different order of parameters.";
    }
}
