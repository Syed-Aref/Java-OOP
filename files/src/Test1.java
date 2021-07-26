
import java.io.*;
public class Test1 {
    public static void main(String[] args) {

        File f1 = new File("file1.txt");
        File f2 = new File("file2.txt");

        System.out.println("file1 exists : " + f1.exists());
        System.out.println("file2 exists : " + f2.exists());
    }
}
