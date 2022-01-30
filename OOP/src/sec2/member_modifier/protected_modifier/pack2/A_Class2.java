package sec2.member_modifier.protected_.pack2;

import sec2.member_modifier.protected_.pack1.A_Class;

public class A_Class2 extends A_Class {
    public static void main(String[] args) {



        // ************************************************************ //
        A_Class ac = new A_Class();

        ///System.out.println(ac.get_num());
        // -->Protected methods can't be called through parent-reference + parent-object

        ///System.out.println(ac.get_num1());
        ///Since get_num1() is default it can not be called

        System.out.println(ac.get_num2());
        // get_num2() can be called since it i public method



        // ************************************************************ //
        A_Class2 a_c2 = new A_Class2();

        System.out.println(a_c2.get_num());

        /// System.out.println(a_c2.get_num1());
        // --> Can not be called since gey_num1() is default method

        System.out.println(a_c2.get_num2());
        // get_num2() can be called since it i public method



        // ************************************************************ //
        A_Class a_c2_ = new A_Class2();

        // System.out.println(a_c2_.get_num());
        // -->Protected methods can't be called through parent-reference + child-object

        // System.out.println(a_c2_.get_num1());
        ///Since get_num1() is default it can not be called

        System.out.println(a_c2_.get_num2());
        // get_num2() can be called since it i public method
    }
}
