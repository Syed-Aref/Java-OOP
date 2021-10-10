///package java_how_to_program;


import java.util.Arrays;

class Info
{
    public String name;
}

public class PassByValue {

    public static void method1(int x)
    {
        x = 78;
        System.out.println("x in method1 is:" + x);
    }
    public static void method2(int[] arr)
    {
        arr[0] = 20;
        System.out.println("arr in method2 is: " + Arrays.toString(arr));
    }
    public static void method2_(int[] arr)
    {
        arr = new int[100];
        System.out.println("arr in method2 is: " + Arrays.toString(arr));
    }
    public static  void method3(Info info)
    {
        info.name = "Prevail";
        System.out.println("info.name in method3 is: " + info.name);
    }

    public static  void method4(Info info)
    {
        info = new Info();
        info.name = "Ahmed";
        System.out.println("info.name in method4 is: " + info.name);
    }

    public static  void method5(Info i)
    {


        System.out.println("Address of i in method5 before re-declaring i is: " + i);
        i = new Info();
        System.out.println("Address of i in method5 after re-declaring i is: " + i);


    }

    public static void main(String[] args) {
        int x = 90;


        System.out.println("x in main method is:" + x);
        method1(x);
        System.out.println("x in main method is:" + x);

        System.out.println("--------------------------------------------");

        int[] arr = {29,5,64,24,45};
        arr[0] = 10;

        System.out.println("arr in main method is: " + Arrays.toString(arr));
        method2(arr);
        System.out.println("arr in main method is: " + Arrays.toString(arr));

        System.out.println("--------------------------------------------");

        Info info = new Info();
        info.name = "Aref";

        System.out.println("info.name in main method is: " + info.name);
        method3(info);
        System.out.println("info.name in main method is: " + info.name);

        System.out.println("--------------------------------------------");

        info = new Info();
        info.name = "Aref";

        System.out.println("info.name in main method is: " + info.name);
        method4(info);
        System.out.println("info.name in main method is: " + info.name);

        System.out.println("--------------------------------------------");

        Info i = new Info();

        System.out.println("Address of i in main method is: " + i);
        method5(i);
        System.out.println("Address of i in main method is: " + i);

        System.out.println("--------------------------------------------");
    }
}
/**

 Java is always pass by value

 Through method1(int x), basically we are passing copy of value.
 
 Case: Primitive data type
 
 Suppose, in main method the address of x is 60_x and value is 90
 In the method, there will be new memory allocated for x of that argument(ex: 70_x) and it will copy the value 90.So, anyh change in method will only affect 70_x not 60_x
 
 Case: Reference data type
 
 Suppose, in main method the address of arr is 1000x. In the method2(int[]) & method2_(int[]) arr will also point to the same address.
  So, Address of arr(main) = 1000x
      Address of arr(method2) = 1000x
      Address of arr(method2_) = 1000x
 So, changing an attribute in megthod2 means changing attribue on memory 1000x
 
 Howeevr, even after reassigining arr in method2_, arr in main method will not be reassigned
 method2_(){
    arr = new int[100];
 }
 Afer that:
 Address of arr(main) = 1000x
 Address of arr(method2_) = 2000x
 So, address of arr in method2_ will be chnaged,but not in main method
 
 
 **/
