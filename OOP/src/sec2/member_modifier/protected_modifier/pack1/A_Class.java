package sec2.member_modifier.protected_modifeir.pack1;

public class A_Class {
    protected int get_num(){
        return 12;
    }
    int get_num1() {
        return 13;
    }
    public int get_num2() {
        return 14;
    }

}

class A_Class_1 extends A_Class {
    public static void main(String[] args) {
        A_Class a_c = new A_Class();
        System.out.println(a_c.get_num());
        System.out.println(a_c.get_num1());
        System.out.println(a_c.get_num2());

        A_Class_1 a_c_1 = new A_Class_1();
        System.out.println(a_c_1.get_num());
        System.out.println(a_c_1.get_num1());
        System.out.println(a_c_1.get_num2());

        A_Class a_c_1_ = new A_Class_1();
        System.out.println(a_c_1_.get_num());
        System.out.println(a_c_1_.get_num1());
        System.out.println(a_c_1_.get_num2());

    }
}
