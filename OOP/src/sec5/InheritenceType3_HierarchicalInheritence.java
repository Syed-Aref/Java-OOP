package sec5;

class A3{
    public void m(){
        System.out.println("This method is m");
    }
}

class B3 extends A3{

}
class C3 extends A3{

}
class D3 extends A3{

}
public class InheritenceType3_HierarchicalInheritence {
    public static void main(String[] args) {
        B3 b3 = new B3();
        C3 c3 = new C3();
        D3 d3 = new D3();


        b3.m();
        c3.m();
        d3.m();
    }
}