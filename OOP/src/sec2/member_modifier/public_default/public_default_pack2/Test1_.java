package sec2.member_modifier.public_default.public_default_pack2;


import sec2.member_modifier.public_default.public_default_pack1.ClassA;

public class Test1_ {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        // ClassB cb = new ClassB(); --> Impossible to create instance
        // ca.m1(); --> Impossible to call; since m1 is default
        ca.m2();

    }
}

class Test2_ {
    public static void main(String[] args) {
        ClassA ca = new ClassA();
        // ClassB cb = new ClassB(); --> Impossible to create instance
        // ca.m1(); --> Impossible to call; since m1 is default
        ca.m2();

    }
}
