package roughPackage;


public class Test {

    static void changef1(Integer i) {
        System.out.println(i);
        i = i + 34;
    }
    public static void main(String[] args) {
        Integer i = new Integer(56);
        changef1(i);
        System.out.println(i);


    }
}
