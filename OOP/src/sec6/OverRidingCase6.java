package sec6;

class P7{
    void m1(){
        System.out.println("Initial m1()");
    }
    void m2(){
        System.out.println("Initial m2()");
    }
}
//Over riding of instance of a class
class TestORC6{
    public static void main(String[] args) {
        P7 p7 = new P7(){
            void m1(){
                System.out.println("New m1()");
            }
        };
        p7.m1();
        p7.m2();

        P7 p7_ = new P7();
        p7_.m1();
        p7_.m2();

    }
}