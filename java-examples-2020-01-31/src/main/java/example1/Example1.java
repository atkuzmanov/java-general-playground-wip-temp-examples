package example1;

public class Example1 {

    static {
        class Inner1 {
            void show() {
                System.out.println("hi.");
            }
        }
        Inner1 is = new Inner1();
        is.show();

        String ss1 = "static string 1";


    }

    public static void main(String[] args) {

    }

    static class InnerStatic {

    }

    class Inner2 {

    }
}
