package sec4;

class A{
    private int x;
    private int y;

    public int get_x() {
        return x;
    }
    public void set_x(int x) {
        this.x = x;
    }
    public int get_y() {
        return y;
    }
}
/// A is tightly encapsulated class

class B{
    int x;
    private int y;

    public int get_x() {
        return x;
    }
    public void set_x(int x) {
        this.x = x;
    }
    public int get_y() {
        return y;
    }
}
/// B is not tightly encapsulated class

class A1 {
    private int a = 90;
}
/// A1 is tightly encapsulated class
class B1 extends A1{
    public int b;
}
/// B1 is not tightly encapsulated class

class C1{
    private int c;
}
/// C1 is tightly encapsulated class

class A2 {
    int a = 90;
}
///A2 is not tightly encapsulated class

class B2 extends A2{
    public int b;
}
///B2 is not tightly encapsulated class

class C2{
    private int c;
}
///C2 is not tightly encapsulated class