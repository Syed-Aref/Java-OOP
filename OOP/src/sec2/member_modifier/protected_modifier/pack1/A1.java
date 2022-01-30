package sec2.member_modifier.protected_modifier.pack1;


class A1 {
    int get_num(){
        return 10;
    }
}

class A1_1 extends A1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        System.out.println(a1.get_num());

        A1_1 a1_1 = new A1_1();
        System.out.println(a1_1.get_num());

        A1 a1_1_ = new A1_1();
        System.out.println(a1_1_.get_num());
    }
}
