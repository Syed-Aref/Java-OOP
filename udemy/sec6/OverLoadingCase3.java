package sec6;



class ClassB{

}

class Test3{
    public void m1(ClassB cB){
        System.out.println(cB);
        System.out.println("Inside m1(ClassB)");
    }
    public void m1(String s){
        System.out.println(s);
        System.out.println("Inside m1(String)");
    }

    public static void main(String[] args) {
        Test3 t3 = new Test3();

        t3.m1(new ClassB()); /// m1( ClassB )
        t3.m1("sfs"); /// m1(String)
        t3.m1(new String("E1E")); /// m1(String)

        // t3.m1(null)
        /**
         * null is default for both ClassB and String
         * They have same root that is Object
         * However, they donot have any relation
         * So compiler can't decide which to execute(ambiguous case)
         **/
        /// Ambiguous case - 1

    }
}