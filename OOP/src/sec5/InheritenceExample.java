class P{
    public void m1() {}
}
class C extends P{
    public void m2() {}
}

public class InheritenceExample {
    public static void main(String[] args) {

        //parent ref. of parent obj.
        P p1 = new P();
        p1.m1();
        ///p1.m2();

        //child ref. of child obj.
        C c1 = new C();
        c1.m1();
        c1.m2();


        //parent ref. of child obj.
        P p2 = new C();
        p2.m1();
        //p2.m2();


        //child ref. of parent obj.
        //C c2 = new P();
        //c2.m1();
        ///c2.m2();
    }
}
