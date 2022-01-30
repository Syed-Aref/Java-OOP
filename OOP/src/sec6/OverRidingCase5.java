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

        System.out.println(p6.a); //12
        System.out.println(p6.b); //14
        System.out.println(p6.c); //16
        System.out.println(p6.d); //18
        System.out.println(p6.m); //30
        System.out.println(p6.n); //40
        //System.out.println(p6.p);
        //System.out.println(p6.q);


        System.out.println("------------------------------");
        System.out.println(c6.a); //22
        System.out.println(c6.b); //24
        System.out.println(c6.c); //26
        System.out.println(c6.d); //28
        System.out.println(c6.m); //30
        System.out.println(c6.n); //40
        System.out.println(c6.p); //50
        System.out.println(c6.q); //60


        System.out.println("------------------------------");
        System.out.println(p6_.a); //12
        System.out.println(p6_.b); //14
        System.out.println(p6_.c); //16
        System.out.println(p6_.d); //18
        System.out.println(p6_.m); //30
        System.out.println(p6_.n); //40
        //System.out.println(p6_.p);
        //System.out.println(p6_.q);


    }
}