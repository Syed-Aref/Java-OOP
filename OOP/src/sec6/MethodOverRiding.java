package sec6;

class P{
    public void m1(int i){
        System.out.println(i +" is in class P");
    }
    public void m2(int j){
        System.out.println("At p.m2(int) => j*90 = "+(j*90));
    }
    public void m3(int j,int k){
        System.out.println("At p.m3(int,int) => j+k+10 = " + (j+k+10));
    }
}

class Child1OfP extends P{
    // m1 = over-riding
    public void m1(int i){
        System.out.println(i +" is in class Child1OfP");
    }

    // m2 = over-riding + over-loading

    // over-riding
    public void m2(int j){
        System.out.println("At Child1OfP.m2(int) => j*65 = "+(j*65));
    }
    // over-loading
    public void m2(int j,int k){
        System.out.println("At Child1OfP.m2(int,int) => (j+k)*65 = "+((j+k)*65));
    }

    // m3 = over-loading
    public void m3(int j){
        System.out.println("At Child1OfP.m3(int) =>j+10 = " + (j+10));
    }
}

class Test_{
    public static void main(String[] args) {
        P p1 = new P();
        Child1OfP c1op_1 = new Child1OfP();
        P p2 = new Child1OfP();

        p1.m1(90); /// m1(int) of P
        c1op_1.m1(45); // m1(int) of Child1OfP
        p2.m1(78); // m1(int) of Child1OfP
        System.out.println("---------------------------------------------------------------");
        p1.m2(89);
        c1op_1.m2(34);
        c1op_1.m2(3,1);
        p2.m2(34);
        /// p2.m2(89,34); -> Not possible(Since it is overloading,done by compiler based on ref)
        System.out.println("---------------------------------------------------------------");
        p1.m3(3,2);
        c1op_1.m3(4,2);
        c1op_1.m3(3);
        p2.m3(1,2);
        /// p2.m3(32); -> Not possible(Since it is overloading,done by compiler based on ref)


    }
}