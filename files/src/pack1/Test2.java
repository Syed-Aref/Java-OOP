package pack1;

import java.io.File;

public class Test2  {
    public static void main(String[] args) throws Exception{
        File f1 = new File("file1.txt");
        File f3 = new File("file3.txt");

        System.out.println("file1 exists : " + f1.exists());
        System.out.println("file3 exists : " + f3.exists());

        File f4 = new File("F:\\Main IJ\\javaFiles\\src\\pack1\\file4.txt");
        if( !f4.exists() ) f4.createNewFile();
        System.out.println(f4.exists());

    }
}
