package sec6;

class P4{
    static void m1(){
        System.out.println("Inside P4.m1()");
    }
}
class Child1OfP4 extends P4{
    static void m1(){
        System.out.println("Inside Child1OfP4.m1()");
    }
    //Since it is static method, it may seem over-riding.But it is over loading
}

class Test4_{
    public static void main(String[] args) {
        P4 p4 = new P4();
        Child1OfP4 c1ofp4 = new Child1OfP4();
        P4 p4_ = new Child1OfP4();

        p4.m1();
        c1ofp4.m1();
        p4_.m1();

    }
}