package sec3;

public class Test {
    public static void main(String[] args) {
        ServiceClass1 sc1 = new ServiceClass1();
        System.out.println(sc1.f1());
        System.out.println(sc1.i);

        SubServiceClass2 ssc2 = new SubServiceClass2();
        System.out.println(ssc2.f1());
        System.out.println(ssc2.i);

        ServiceClass3 sc3 = new ServiceClass3();
        sc3.method_a();
        sc3.method_b();
        sc3.method_c();

    }
}
