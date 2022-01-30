package sec5;


class A2{
    public void m1(){
        System.out.println("This method is m1");
    }
}
class B2 extends A2{
    public void m2(){
        System.out.println("This method is m2");
    }
}
class C2 extends B2{
    public void m3(){
        System.out.println("This method is m3");
    }
}

public class InheritenceType2_MultiLevelInheritence {
    public static void main(String[] args) {
        C2 c2 = new C2();

        c2.m1();
        c2.m2();
        c2.m3();
    }
}