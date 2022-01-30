package sec6;

class Test1{
    public void m1(int i){
        // -----------
        System.out.println("i:"+i);
    }
    public void m1(float f){
        // -----------
        System.out.println("f:"+f);
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();

        /// Automatic promotion
        t1.m1(56); // m1(int)
        t1.m1(45.4f); // m1(float)
        t1.m1( 'a' );
        // char can be promoted tom both int,float but earliest promotion is int
        /// m1(int)

        /// t1.m1(234.2);
        /// float,int both are below double
        /// so double data type can be passed

        t1.m1(7688l);
        /// nearest promotion for long is float
        /// m1(float)
    }
}