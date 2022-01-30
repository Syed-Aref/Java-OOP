package sec6;

public class Variable_Arguments {

    static void funC(int ...a)
    {
        System.out.println("Number of arguments: " + a.length);

        // using for each loop to display contents of a
        for (int i: a)
        System.out.print(i + " ");
        System.out.println();
    }
    // method func(int ...a) can take 0,1,2 or infinite number of integers in parameter
    // The variable arguments(var-args) allows the method to accept zero or multiple arguments

    public static void main(String args[])
    {
        // Calling the var-args method with different number of parameters
        funC(100);         // one parameter
        funC(1, 2, 3, 4);  // four parameters
        funC();            // no parameter
    }

}