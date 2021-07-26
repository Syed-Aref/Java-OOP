package sec3;

interface Interface2 {
    public abstract void method_a();
    public abstract void method_b();

}
interface Interface3 {
    public abstract void method_b();
    public abstract void method_c();

}


class ServiceClass3 implements Interface2,Interface3 {
    public void method_a() {
        System.out.println("ServiceClass3 implements method_a() for Interface2");
    }
    public void method_b() {
        System.out.println("ServiceClass3 implements method_b() for Interface2,Interface3");
    }
    public void method_c() {
        System.out.println("ServiceClass3 implements method_c() for Interface3");
    }
}