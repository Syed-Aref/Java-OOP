package sec6;



class P6{
    static int a = 12;
    static int b = 14;
    int c = 16;
    int d = 18;

    static int m = 30;
    int n = 40;

}
class Child6 extends P6{
    static int a = 22;
    int b = 24;
    static int c = 26;
    int d = 28;

    static int p = 50;
    int q = 60;
}

class Test6_{
    public static void main(String[] args) {
        P6 p6 = new P6();
        Child6 c6 = new Child6();
        P6 p6_ = new Child6();

        System.out.println(p6.a);
        System.out.println(p6.b);
        System.out.println(p6.c);
        System.out.println(p6.d);
        System.out.println(p6.m);
        System.out.println(p6.n);
        //System.out.println(p6.p);
        //System.out.println(p6.q);


        System.out.println("------------------------------");
        System.out.println(c6.a);
        System.out.println(c6.b);
        System.out.println(c6.c);
        System.out.println(c6.d);
        System.out.println(c6.m);
        System.out.println(c6.n);
        System.out.println(c6.p);
        System.out.println(c6.q);


        System.out.println("------------------------------");
        System.out.println(p6_.a);
        System.out.println(p6_.b);
        System.out.println(p6_.c);
        System.out.println(p6_.d);
        System.out.println(p6_.m);
        System.out.println(p6_.n);
        //System.out.println(p6_.p);
        //System.out.println(p6_.q);


        /**
         *
         * Variable over-riding: not possible
         * However child class can have those variables that are present in parent but not inside them
         */
    }
}