package sec6;

public class MethodOverLoading {
    public void m1(int i){
        System.out.println("Given int:"+i);
    }

    /// Method signature : m1(int)

    /*
    public int m1(int i){
        return i*9;
    }
    /// method signature is based on method name and parameter only
     */
    public void m1(int i,int j){

        System.out.println( "(i+78)*j = "+( (i+78)*j ) );
    }
    /// Method signature : m1(int,int)

    public int m1(int i,int j,int k){
        return i*10 + j*20 + k*30;
    }
    /// Method signature : m1(int,int,int)

    /** For different method signatures return type does not matter **/

    public static void main(String[] args) {

        // Over-loading of abs(int/long/float/..) method of Math class
        System.out.println(Math.abs(8));
        System.out.println(Math.abs(8l));
        System.out.println(Math.abs(-5.7f));

        MethodOverLoading mol = new MethodOverLoading();
        mol.m1(67);
        mol.m1(4,3);

    }
}
