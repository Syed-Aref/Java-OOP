package sec5;


class A1{
    public void m1() {
        System.out.println("this method is m1");
    }
}
class B1 extends A1{
    public void m2() {
        System.out.println("this method is m2");
    }
}
public class InheritenceType1_SingleInheritence {
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.m1();
        b1.m2();
    }
}