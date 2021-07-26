package sec2.public_vs_default_class.pack2;


import sec2.public_vs_default_class.pack1.A;
/// import sec2.public_vs_default_class.pack1.B;
/// Note: Can not import class 'B',since it is not public class and outside package

public class Test2 {
    public static void main(String[] args) {
        A a = new A();
        /// B b = new B(); --> Impossible since B is default class
    }
}
