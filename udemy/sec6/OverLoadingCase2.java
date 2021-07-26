package sec6;


class ClassA{

}

class Test2{
    public void m1(ClassA cA){
        System.out.println(cA);
        System.out.println("Inside m1(ClassA)");
    }
    public void m1(Object O){
        System.out.println(O);
        System.out.println("Inside m1(Object");
    }


    public static void main(String[] args) {
        Test2 t2 = new Test2();

        t2.m1(new ClassA()); /// t1(ClassA)
        t2.m1(new Object()); /// t1(Object)
        //t2.m1("AKDA");

        t2.m1(null); /// t1(ClassA)
        /**
         * null is default for both Object and ClassA
         * However, classA is child of Object(Object is parents/root)
         * Child will get more priority
         * t1(ClassA) is executed
         **/

        // Child will get more priority
    }
}