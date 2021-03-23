public class Serial_of_class_and_methods { 

    public static int add(int x,int y,int z)
    {
        OOP_Class1 opc1 = new OOP_Class1();
        return opc1.mult(x,y)+z;
        /// return mult(x,y)+z; /// /// This is also correct
    }
    public static int mult(int x,int y)
    {
        return x*y;
    }

    public static void use_classT()
    {
        T t = new T();
        t.method_t();
    }

    public static void main(String[] args) {
        use_classT();

    }

}
class T
{
    public static void method_t()
    {
        System.out.println("Hello class T");
        /// Serials in java(for methods and clas) does not matter.
    }
}
