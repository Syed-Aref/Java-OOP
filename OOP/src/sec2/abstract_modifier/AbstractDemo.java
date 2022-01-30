package sec2.abstract_modifier;

abstract class ClassA {
    public abstract void f1();
    public abstract void f2();

}

class SubClassA1 extends ClassA{
    public void f1(){
        System.out.println("Function f1 is in : SubClassA1");
    }
    public void f2(){
        System.out.println("Function f2 is in : SubclassA2");
    }
}

abstract class SubClassA2 extends ClassA {
    public abstract void f1();
    public void f2(){
        System.out.println("Function f2 is in : SubClassA2/SubSubClassA2");
    }
}

class SubSubClassA2 extends SubClassA2 {
    public void f1(){
        System.out.println("Function f1 is in : SubSubClassA2");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        /// ClassA ca = new ClassA(); --> Not possible
        ClassA ca = new ClassA() {
            @Override
            public void f1() {
                System.out.println("Function f1 is in : ClassA but implemented inside main-method");
            }

            @Override
            public void f2() {
                System.out.println("Function f2 is in : ClassA but implemented inside main-method");
            }
        };
        ca.f1();
        ca.f2();

        SubClassA1 sca1 = new SubClassA1();
        sca1.f1();
        sca1.f2();

        /// SubClassA2 sca2 = new SubClassA2(); --> Not possible
        SubClassA2 sca2 = new SubClassA2() {
            @Override
            public void f1() {
                System.out.println("Function f1 is in : SubClassA2 but implemented inside main-method");
            }
        };
        sca2.f1();
        sca2.f2();

        SubSubClassA2 ssca2 = new SubSubClassA2();

        ssca2.f1();
        ssca2.f2();

    }
}
