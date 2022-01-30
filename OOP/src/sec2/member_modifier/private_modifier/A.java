package sec2.member_modifier.private_;

public class A {
    private int n;
    int m;
    public int p;
    public A(int i) {
        n = i;
        m = i;
        p = i;
    }
    public int ret_n()
    {
        return n;
    }
    public int ret_m()
    {
        return m;
    }
    public int ret_p()
    {
        return p;
    }

}
class Test{
    public static void main(String[] args) {
        A a = new A(10);
        System.out.println(a.ret_n());
        System.out.println(a.ret_m());
        System.out.println(a.ret_p());

        /// System.out.println(a.n);--> Can not be accessed; as it is private
        System.out.println(a.m);
        System.out.println(a.p);
    }
}
