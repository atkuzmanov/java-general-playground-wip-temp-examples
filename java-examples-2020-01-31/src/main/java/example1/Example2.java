package example1;

public class Example2 {

    void a() {
    }

    static void c() {
    }

    public class Inner1 {
        public Inner1() {
        }

        void a() {
        }

        void c() {
        }

        public void b() {
            a();
            c();
            Example2.c();
            Example2 e2 = new Example2();
            e2.a();
        }
    }

}


class Example4 {
    Example2 e2 = new Example2();
    Example2.Inner1 in1 = e2.new Inner1();
}

