package sec5;

import java.util.concurrent.RecursiveTask;

interface P1{
    abstract public void m1();
    abstract public int m2();
    abstract public void m3();
}
interface P2{
    abstract public int m2();
    abstract public void m3();
    abstract public int m4();
}
interface P3{
    abstract public int m3();
    abstract public int m4();
    abstract public void m5();
}

class ImplementationClass1 implements P1,P2{
    public void m1(){

    }
    public int m2(){
        return 2;
    }
    public void m3(){

    }
    public int m4(){
        return 4;
    }
}
/**
class ImplementationClass2 implements P2,P3 {
    public int m2(){
        return 2;

    }

    public void m3(){

    }
    // will m3 be void or int type?
    public int m4(){
        return 4;
    }
    public void m5(){

    }
}**/

/** We need to implement interface P3 separately for conflicting with P1,P2 **/


class ImplementationClass2 implements P3{
    public int m3(){
        return 0;
    }

    public int m4() {
        return 0;
    }

    public void m5(){

    }
}

public class SpecialInheritence_MultipleInheritence {
    public static void main(String[] args) {
        ImplementationClass1 ic1 = new ImplementationClass1();

        ic1.m1();
        System.out.println(ic1.m2());
        ic1.m3();
        System.out.println(ic1.m4());
    }
}
