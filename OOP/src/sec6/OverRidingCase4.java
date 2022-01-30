package sec6;


class P5{
    void m1(int... i){
        System.out.println("Inside P5.m1(int...)");
    }
    void m1(int i){
        System.out.println("Inside P5.m1(int)");
    }

    void m1(int i,int j,int k){
        System.out.println("Inside P5.m1(int,int,int)");
    }

}
class Child5 extends P5{
    void m1(int... i){
        System.out.println("Inside Child5.m1(int...)");
    }


    void m1(int i){
        System.out.println("Inside Child5.m1(int)");
    }

    void m1(int i,int j){
        System.out.println("Inside Child5.m1(int,int)");
    }


}

public class OverRidingCase4 {
    public static void main(String[] args) {
        P5 p5 = new P5();
        Child5 c5 = new Child5();
        P5 p5_ = new Child5();


        p5.m1();
        p5.m1(3);
        p5.m1(3,4);
        p5.m1(3,4,2);
        p5.m1(3,1,3,1);
        System.out.println("-------------------------------------------------");
        c5.m1();
        c5.m1(3);
        c5.m1(3,4);
        c5.m1(3,4,2);
        c5.m1(3,1,3,1);
        System.out.println("-------------------------------------------------");
        p5_.m1();
        p5_.m1(3);
        p5_.m1(3,4);
        p5_.m1(3,4,2);
        p5_.m1(3,1,3,1);
        System.out.println("-------------------------------------------------");
    }
}
 /**
 * P: m1(int...) ,m1(int),m1(int,int,int)
 * C: m1(int...) ,m1(int),m1(int,int)
 * Since,m1(int,int,int) has only been implemented in parent class but nor in child class
 * it will go to exclusively to parent class(regardless what ref or object combination is done)
 **/