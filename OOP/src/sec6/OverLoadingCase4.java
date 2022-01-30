package sec6;

class Test4{
    public void m1(int i){
        System.out.println("Inside m1(int)");
    }

    public void m1(int... i){
        System.out.println("Inside m1(int...)");
    }
    /// m1(int...) means we can pass as many numbers of int as we want(0,1,2,...,infinity)
    public static void main(String[] args) {
        Test4 t4 = new Test4();

        t4.m1(); /// m1(int...)

        t4.m1(1); /// m1(int)
        // Exact method call gets higher priority

        t4.m1(2,4); /// m1(int...)

    }
}