package sec6;

class P2{
    final int m1(int i){
        return i+909 ;
    }
    int m2(){
        return 908;
    }
    void m3(){

    }
}

class Child1OfP2 extends P2{
    /**
    final int m1(int i){
        return i+909 ;
    }
    ///Not possible

    int m1(int i){
        return i+909 ;
    }
    ///Not possible
    **/
    final int m2(){
        return 100;
    }


}

abstract class Child2OfP2 extends P2{
    abstract void m3();
}

abstract class P3{
    abstract void meth1();
}

class Child1OfP3{
    void meth1(){
        System.out.println("Child1OfP3.meth1()");
    }
}

class Test2_{
    public static void main(String[] args) {

        /// private methods no visible to Child class
        /// final methods can-not be over-ride


    }
}