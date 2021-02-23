class SuperClass
{
        public int methodAdd(int x, int y)
        {
            return x + y;
        }
}

class SubClassForMethodSqr extends SuperClass
{
    int MethodSqr(int x)
    {
        return x * x ;
    }
}

class SubClassForMethodCube extends SuperClass
{
    int MethodCub(int x)
    {
        return x * x * x;
    }
}



public class SubSuper_Main {
    public static void main(String[] args) {

        SubClassForMethodSqr sqr = new SubClassForMethodSqr();
        SubClassForMethodCube cub = new SubClassForMethodCube();
        System.out.println(cub.methodAdd(7,8));
        System.out.println(cub.MethodCub(7));
        System.out.println(sqr.methodAdd(9,10));
        System.out.println(sqr.MethodSqr(9));
    }
}
