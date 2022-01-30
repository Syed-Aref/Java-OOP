package sec2.member_modifier.public_default.public_default_pack1;

public class Test1 {
    public static void main(String[] args) {
        ClassA ca =new ClassA();
        ClassB cb = new ClassB();

        ca.m1();
        ca.m2();

        cb.m1();
        cb.m2();
    }
}
class Test2 {
    public static void main(String[] args) {
        ClassA ca =new ClassA();
        ClassB cb = new ClassB();

        ca.m1();
        ca.m2();

        cb.m1();
        cb.m2();
    }
}