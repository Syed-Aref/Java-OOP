package sec3;

public interface Interface1 {
    public static int i = 30;

    public abstract void m1() ;
    public abstract int f1();
}
class ServiceClass1 implements Interface1 {
    public void m1() {
        System.out.println("Inside m1 method of ServiceClass1");
    }
    public int f1() {
        return 0;
    }
    // We are allowed to have methods that are not in Interface
    void m2() {

    }
}
abstract class ServiceClass2 implements Interface1 {
    public void m1() {
        System.out.println("Inside m1 method of ServiceClass1");
    }
}
class SubServiceClass2 extends ServiceClass2 {
    public int f1() {
        return 10;
    }
}
