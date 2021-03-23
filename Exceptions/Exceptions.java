package java_how_to_program;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;

        t = sc.nextInt();
        while(t-->0)
        {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            try{
                System.out.println(a/b);
            }
            catch (Exception e)
            {
                System.out.println("you made error");
                System.out.println("Your error is : "+e);
            }
        }

    }
}
